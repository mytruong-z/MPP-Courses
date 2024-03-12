package lesson9.Lab9Part2.prob12;

import java.util.Optional;

public class MySingletonLazy {
    private static MySingletonLazy instance = null;
    private MySingletonLazy() {}
    public static MySingletonLazy getInstance() {
        return Optional.ofNullable(instance)
                .orElseGet(() -> {
                    instance = new MySingletonLazy();
                    return instance;
                });
    }

    public static void main(String[] args) {
        MySingletonLazy s1 = MySingletonLazy.getInstance();
        MySingletonLazy s2 = MySingletonLazy.getInstance();

        System.out.println(s1 == s2); // Should print true
    }
}

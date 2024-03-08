package lab8.prob4;

import java.util.List;
public class WordCounter {
    public int countWords(List<String> words, char c, char d, int len) {
        return (int) words.stream()
                .filter(word -> word.length() == len)
                .filter(word -> word.indexOf(c) > -1)
                .filter(word -> word.indexOf(d) == -1)
                .count();
    }

    public static void main(String[] args) {
        WordCounter wc = new WordCounter();

        List<String> wordList = List.of("Hello", "World", "Goodbye", "Back", "Soon");
        char charC = 'o';
        char charD = 'l';
        int length = 4;

        int result = wc.countWords(wordList, charC, charD, length);
        System.out.println(result);
    }
}

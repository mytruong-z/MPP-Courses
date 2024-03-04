package lab5.src.prob2;

public class Main {
    public static void main(String[] args) {
        GeometricFigure[] figures = {
                new Rectangle(3, 4),
                new Triangle(3, 4),
                new Circle(5)
        };

        Double sum = 0.0;

        for (GeometricFigure figure : figures) {
            sum += figure.computeArea();
        }

        System.out.printf("Sum of Area = %s", sum);
    }
}

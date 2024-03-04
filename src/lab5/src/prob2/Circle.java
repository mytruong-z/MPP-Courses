package lab5.src.prob2;

public final class Circle implements GeometricFigure {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        return Math.PI * radius * radius;
    }
}

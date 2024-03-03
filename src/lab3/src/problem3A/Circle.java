package lab3.src.problem3A;

public class Circle extends Cylinder {
    public Circle(double radius) {
        super(radius, 0);
    }

    public double computeArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

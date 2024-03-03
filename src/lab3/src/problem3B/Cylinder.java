package lab3.src.problem3B;

public class Cylinder {
    private Circle circle;
    private double height;

    public Cylinder(double radius, double height) {
        circle = new Circle(radius);
        this.height = height;
    }

    public double computeVolume() {
        return circle.computeArea() * height;
    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return circle.getRadius();
    }
}

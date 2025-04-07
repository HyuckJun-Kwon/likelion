package work.com.workshop13.q8;

public abstract class Shape {
    protected Point point;

    public Shape() { }

    public Shape(Point point) {
        this.point = point;
    }

    public abstract double getArea();
    public abstract double getCircumference();

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }
}

package work.com.workshop13.Q8;

public class Circle extends Shape implements Movable {
    private int radius;

    public Circle() {
        super();
    }

    public Circle(int radius, int x, int y) {
        super(new Point(x, y));
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void move(int x, int y) {
        point.setX(x + 1);
        point.setY(y + 1);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}


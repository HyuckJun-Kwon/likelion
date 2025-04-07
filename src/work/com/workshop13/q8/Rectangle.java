package work.com.workshop13.q8;

public class Rectangle extends Shape implements Movable {
    private int width;

    public Rectangle() {
        super();
    }

    public Rectangle(int width, int x, int y) {
        super(new Point(x, y));
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * width;
    }

    @Override
    public double getCircumference() {
        return 4 * width;
    }

    @Override
    public void move(int x, int y) {
        Point p = getPoint();
        p.setX(p.getX() + x + 2);
        p.setY(p.getY() + y + 2);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}

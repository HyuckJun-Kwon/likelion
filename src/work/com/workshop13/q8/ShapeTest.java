package work.com.workshop13.q8;

import java.util.ArrayList;

public class ShapeTest {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(4, 7, 5));
        shapes.add(new Rectangle(5, 4, 6));
        shapes.add(new Circle(6, 6, 7));
        shapes.add(new Circle(7, 8, 3));

        System.out.println("구분\t길이\tX좌표\tY좌표\tArea\tCircumference");
        for (Shape shape : shapes) {
            printShapeInfo(shape);
        }

        System.out.println("이동 후...");
        for (Shape shape : shapes) {
        	((Movable) shape).move(10, 10);
            printShapePosition(shape);
        }
    }

    private static void printShapeInfo(Shape shape) {
        String name = shape instanceof Rectangle ? "Rectangle" : "Circle";
        int length = shape instanceof Rectangle ? ((Rectangle) shape).getWidth() : ((Circle) shape).getRadius();
        System.out.printf("%s\t%d\t%d\t%d\t%.0f\t%.0f\n",
                name,
                length,
                shape.getPoint().getX(),
                shape.getPoint().getY(),
                shape.getArea(),
                shape.getCircumference());
    }

    private static void printShapePosition(Shape shape) {
        String name = shape instanceof Rectangle ? "Rectangle" : "Circle";
        int length = shape instanceof Rectangle ? ((Rectangle) shape).getWidth() : ((Circle) shape).getRadius();
        System.out.printf("%s\t%d\t%d\t%d\n",
                name,
                length,
                shape.getPoint().getX(),
                shape.getPoint().getY());
    }
}

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LineSegment line = new LineSegment(5.0);
        System.out.println("Length of line segment: " + line.getPerimeter());

        ArrayList<Shape2D> shapes2D = new ArrayList<>();
        shapes2D.add(new Square(2.0));
        shapes2D.add(new Circle(1.0));
        for (Shape2D shape : shapes2D) {
            System.out.println("Perimeter of " + shape.getClass().getSimpleName() + ": " + shape.getPerimeter());
        }

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Square(5));
        shapes.add(new Circle(3));
        shapes.add(new Sphere(4));
        shapes.add(new Cube(2));
        for (Shape shape : shapes) {
            System.out.println("Area of " + shape.getClass().getSimpleName() + ": " + ((Shape2D) shape).getArea());
        }

        ArrayList<Shape3D> shapes3D = new ArrayList<>();
        shapes3D.add(new Sphere(4));
        shapes3D.add(new Cube(2));
        for (Shape3D shape : shapes3D) {
            System.out.println("Volume of " + shape.getClass().getSimpleName() + ": " + shape.getVolume());
        }
    }
}
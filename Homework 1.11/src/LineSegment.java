public class LineSegment implements Shape {
    private double length;
    public LineSegment(double length) {
        this.length = length;
    }
    @Override
    public double getPerimeter() {
        return length;
    }
}
package shapes;

public class Triangle implements Shape {
    private final double side1;
    private final double side2;
    private final double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        //Heron formula
        double halfPerimeter = (side1 + side2 + side3) / 2.0;

        return Math.sqrt(halfPerimeter *
                (halfPerimeter - side1) *
                (halfPerimeter - side2) *
                (halfPerimeter - side3));
    }
}

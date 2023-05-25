package shapes;

public class Square implements Shape {
    private final double side;

    public Square(double side) {
        this.side = side;
    }
    @Override
    public double calculateArea() {
        return Math.pow(side, side);
    }
}

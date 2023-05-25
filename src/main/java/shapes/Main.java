package shapes;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = shapesArr();
        String result = calculateSumArea(shapes);

        System.out.println(result);
    }

    public static Shape[] shapesArr() {
        Shape[] shapes = new Shape[9];
        shapes[0] = new Circle(3.0);
        shapes[1] = new Circle(1.5);
        shapes[2] = new Square(3);
        shapes[3] = new Square(1.8);
        shapes[4] = new Square(7);
        shapes[5] = new Square(6.333);
        shapes[6] = new Triangle(3, 4, 5);
        shapes[7] = new Triangle(4, 6.7, 9.6);
        shapes[8] = new Triangle(6.8, 9, 12.7);

        return shapes;
    }

    public static String calculateSumArea(Shape[] shapes) {
        double sumArea = 0.0;
        int totalShapesCount = 0;
        for (Shape shape: shapes) {
            totalShapesCount++;
            sumArea += shape.calculateArea();
        }

        return "Total area of " + totalShapesCount + " shapes is " + sumArea + " square meters";
    }
}

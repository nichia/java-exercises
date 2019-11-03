package exercises.shapes;

public class Program {
    public static void main(String[] args) {
        // add Shapes
        Circle circle = new Circle("circle", 3.5);
        Square square = new Square("square", 3.5);
        square.setShapeId();
        Rectangle rectangle = new Rectangle("rectangle", 1.5, 2.5);
        rectangle.setShapeId();



        // print Shapes
        System.out.println(circle);
        System.out.println(square);
        System.out.println(rectangle);
    }
}

package exercises.shapes;

public class Square extends AbstractEntity {
    private Double length;
    private int shapeId;

    public Square(String aName, Double aLength) {
        super(aName);
        this.length = aLength;
    }

    public void setShapeId() {
        this.shapeId = getShapeId();
    }

    public String toString() {
        String squareStr = getName() + " Length: " + length + " Id: " + shapeId;

        return squareStr;
    }
}

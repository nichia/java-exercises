package exercises.shapes;

public class Rectangle extends AbstractEntity{
    private Double length;
    private Double width;
    private int shapeId;

    public Rectangle(String aName, Double aLength, Double aWidth) {
        super(aName);
        this.length = aLength;
        this.width = aWidth;
    }

    public void setShapeId() {
        this.shapeId = getShapeId();
    };

    public String toString() {
        String recStr = getName() + " Length: " + length + " Width: " + width + " Id: " + shapeId;

        return recStr;
    }
}

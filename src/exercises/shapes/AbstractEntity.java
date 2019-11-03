package exercises.shapes;

public abstract class AbstractEntity {

    private int shapeId;
    private String name;
    private static int nextShapeId = 0;

    public AbstractEntity(String aName) {
        this.name = aName;
        shapeId++;
    }

    public int getShapeId() {
        nextShapeId++;
        return nextShapeId;

    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public abstract void setShapeId();
}

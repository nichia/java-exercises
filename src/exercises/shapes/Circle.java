package exercises.shapes;

public class Circle extends Shape {
    private Double diameter;

    public Circle (String aName, Double aDiameter) {
        super(aName);
        this.diameter = aDiameter;
    }

    public String toString() {
        String circleStr = getName() + " Diameter: " + diameter;

        return circleStr;
    }
}

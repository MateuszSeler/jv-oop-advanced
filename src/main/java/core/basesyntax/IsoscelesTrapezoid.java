package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstSide;
    private int secondSide;
    private int height;

    public IsoscelesTrapezoid(int firstSide, int secondSide, int height, Color color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return ((firstSide + secondSide) * height / 2);
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: isosceles trapezoid, area: " + getArea() + " sq. units"
                        + ", first side: " + firstSide + " units"
                        + ", second side: " + secondSide + " units"
                        + ", height: " + height + " units"
                        + ", color: " + getColor());
    }
}

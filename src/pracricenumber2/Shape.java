package pracricenumber2;

public class Shape {
    private String color;
    public int sidesCount;

    public Shape(String color, int sidesCount) {
        this.color = color;
        this sidesCount = sidesCount;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getSidesCount() {
        return sidesCount;
    }
}


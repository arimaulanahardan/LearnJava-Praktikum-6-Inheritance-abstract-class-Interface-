package CyrcleAndCylinder;

public class Circle {
	// private instance variable, not accessible from outside this class
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double r) {
        this.radius = r;
        this.color = "red";
    }

    public Circle(double r, String c){
        this.radius = r;
        this.color = c;
    }

    public double getRadius() {
        return radius;
    }

    /** Returns the area of this Circle instance */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }
}


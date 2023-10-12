package ss4.baitap.Circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }
    public double getRadius(){

        return 2 * Math.PI * this.radius;
    }
    public double getArea(){
        return Math.PI * Math.pow(this.radius,2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}

package ss6.baitap.circle_and_cylinder;

public class Circle {

  private double radius = 1;
  private String color = "none color";

  public Circle() {
  }

  public Circle(double radius, String color) {
    this.radius = radius;
    this.color = color;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Double getArea() {
    return Math.pow(radius, 2) * Math.PI;
  }

  public Double getPerimeter() {
    return 2 * radius * Math.PI;
  }

  @Override
  public String toString() {
    return "radius= " + radius +
        ", color= " + color;
  }
}

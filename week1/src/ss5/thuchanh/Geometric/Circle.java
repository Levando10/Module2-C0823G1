package ss5.thuchanh.Geometric;

public class Circle extends Geometric {

  private double radius;

  public Circle() {
  }

  public Circle(double radius) {
    this.radius = radius;
  }

  public Circle(String color, String filled, double radius) {
    super(color, filled);
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return Math.PI * Math.pow(this.radius, 2);
  }

  public double getPerimeter() {
    return (this.radius * 2) * Math.PI;
  }

  public double getDiameter() {
    return (this.radius * 2);
  }

  public void printCircle() {
    System.out.println("The " + getColor() + " circle is created with the radius is " + radius);
  }

  @Override
  public String toString() {
    return "Circle{" +
        "radius=" + radius +
        "} " + super.toString();
  }

}

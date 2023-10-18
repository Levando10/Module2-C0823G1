package ss6.baitap.circle_and_cylinder;

public class Cylinder extends Circle {

  private double height;

  public Cylinder() {
  }

  public Cylinder(double height) {
    this.height = height;
  }


  public Cylinder(double radius, String color, double height) {
    super(radius, color);
    this.height = height;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getVolume() {
    return getArea() * height;
  }

  public double getAreaOFTwoCircular() {
    return getArea() * 2;
  }


  public double getAreaSurrounding() {
    return getPerimeter() * height;
  }


  public double totalArea() {
    return getAreaSurrounding() + getAreaOFTwoCircular();
  }

  @Override
  public String toString() {
    return "Cylinder " +
        "height = " + height +
        " " + super.toString();
  }
}

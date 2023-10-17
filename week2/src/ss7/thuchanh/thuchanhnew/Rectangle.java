package ss7.thuchanh.thuchanhnew;

public class Rectangle extends GeometricObject {

  private double width;
  private double height;

  public Rectangle() {
  }

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public Rectangle(String color, boolean filled, double width, double height) {
    super(color, filled);
    this.width = width;
    this.height = height;
  }

  @Override
  public String toString() {
    return "Rectangle{" +
        "width=" + width +
        ", height=" + height +
        "} " + super.toString();
  }

  @Override
  public double getArea() {
    return width * height;
  }

  @Override
  public double getPerimeter() {
    return (width + height) * 2;
  }
}

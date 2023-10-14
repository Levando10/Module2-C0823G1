package ss5.thuchanh.Geometric;

public class Rectangle extends Geometric {

  private double width;
  private double height;

  public Rectangle() {
  }

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public Rectangle(String color, String filled, double width, double height) {
    super(color, filled);
    this.width = width;
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getArea() {

    return this.height * this.width;
  }

  public double getPerimeter() {
    return (this.height + this.width) * 2;
  }

  @Override
  public String toString() {
    return "Rectangle{" +
        "width=" + width +
        ", height=" + height +
        "} " + super.toString();
  }
}

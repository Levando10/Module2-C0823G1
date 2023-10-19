package ss7.baitap.resizeable;

public class Rectangle extends Shape implements Resizeable {


  private double width;
  private double height;

  public Rectangle(String color, String painted, double width, double height) {
    super(color, painted);
    this.width = width;
    this.height = height;
  }

  public Rectangle(String color, String painted) {
    super(color, painted);
  }

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public Rectangle() {
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

  @Override
  public double getArea() {
    return this.width * this.height;
  }

  @Override
  public String toString() {
    return "Rectangle{" +
        "width=" + width +
        ", height=" + height +
        '}';
  }

  @Override
  public void resize(double percent) {
    if (percent >= 1 && percent <= 100) {
      this.width = this.width + (this.width / 100) * percent;
      this.height = this.height + (this.height / 100) * percent;
    }

  }
}

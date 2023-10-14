package ss6.thuchanh.newTest;

public class Square extends Rectangle {

  public Square() {
  }

  public Square(double side) {
    super(side, side);
  }

  public Square(String color, boolean filled, double side) {
    super(color, filled, side, side);
  }

  public void setSide(double side) {
    super.setWidth(side);
    super.setLength(side);
  }

  public double getSide() {
    return getWidth();
  }

  @Override
  public void setLength(double side) {
    super.setLength(side);
  }

  @Override
  public void setWidth(double side) {
    super.setWidth(side);
  }

  @Override
  public String toString() {
    return "A Square with side = " + getSide() + " , which is a subclass of " + super.toString();
  }
}

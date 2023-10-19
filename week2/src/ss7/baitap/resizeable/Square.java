package ss7.baitap.resizeable;

public class Square extends Rectangle {

  public Square() {
  }

  public Square(String color, String painted, double side) {
    super(color, painted, side, side);
  }

  public Square(String color, String painted) {
    super(color, painted);
  }

  public Square(double side) {
    super(side, side);
  }


  public double getSide() {
    return super.getWidth();
  }

  public void setSide(double side) {
    super.setWidth(side);
    super.setHeight(side);
  }

  @Override
  public String toString() {
    return "Square{side = } " + super.getWidth();
  }
}

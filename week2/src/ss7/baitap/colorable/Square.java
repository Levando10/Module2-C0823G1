package ss7.baitap.colorable;

public class Square extends ss7.baitap.resizeable.Square implements Colorable {

  public Square() {
  }

  public Square(double side) {
    super(side);
  }

  @Override
  public String howToColor() {
    return " Color all four sides.. ";
  }
}

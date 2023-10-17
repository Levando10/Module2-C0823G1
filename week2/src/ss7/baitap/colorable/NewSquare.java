package ss7.baitap.colorable;

import ss7.baitap.resizeable.Square;

public class NewSquare extends Square implements Colorable {

  public NewSquare() {
  }

  public NewSquare(double side) {
    super(side);
  }

  @Override
  public String howToColor() {
    return " Color all four sides.. ";
  }
}

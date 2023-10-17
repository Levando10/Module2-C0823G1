package ss7.baitap.resizeable;

public class Square extends Shape implements Resizeable {

  private double side;

  public Square() {
  }

  public double getSide() {
    return side;
  }

  public void setSide(double side) {
    this.side = side;
  }

  public Square(double side) {
    this.side = side;
  }

  @Override
  public double getArea() {
    return Math.pow(this.side, 2);
  }

  @Override
  public String toString() {
    return "Square{" +
        "side=" + side +
        '}';
  }

  @Override
  public void resize(double percent) {
    if (percent >= 1 && percent <= 100) {
      this.side = this.side + (this.side / 100) * percent;
    }

  }
}

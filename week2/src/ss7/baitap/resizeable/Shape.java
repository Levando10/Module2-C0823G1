package ss7.baitap.resizeable;

import ss6.thuchanh.newTest.Square;

public abstract class Shape {

  private String color;
  private String painted;

  public Shape() {
  }

  public Shape(String color, String painted) {
    this.color = color;
    this.painted = painted;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getPainted() {
    return painted;
  }

  public void setPainted(String painted) {
    this.painted = painted;
  }
}

package ss7.thuchanh.thuchanhnew;

import java.util.Date;

public abstract class GeometricObject {

  private String color;
  private boolean filled;
  private java.util.Date dateCreated;

  public GeometricObject() {
    dateCreated = new java.util.Date();
  }

  public GeometricObject(String color, boolean filled) {
    dateCreated = new java.util.Date();
    this.color = color;
    this.filled = filled;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public boolean isFilled() {
    return filled;
  }

  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  public Date getDateCreated() {
    return dateCreated;
  }

  @Override
  public String toString() {
    return "GeometricObject " +
        "color  '" + color + '\'' +
        ", filled  " + filled +
        ", dateCreated :" + dateCreated;
  }

  public abstract double getArea();

  public abstract double getPerimeter();
}

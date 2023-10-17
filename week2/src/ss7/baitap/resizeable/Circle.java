package ss7.baitap.resizeable;

public class Circle extends Shape implements Resizeable {

  private double radius;

  public Circle() {
  }

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public double getArea() {
    return Math.PI * Math.pow(this.radius, 2);
  }

  @Override
  public String toString() {
    return "Circle{" +
        "radius=" + radius +
        '}';
  }

  @Override
  public void resize(double percent) {
    if (percent >= 1 && percent <= 100) {
      this.radius = this.radius + (this.radius / 100) * percent;
    }

//    double randomDouble = Math.random();
//    randomDouble = randomDouble * 100 + 1;
//    int randomInt = (int) randomDouble;
//    this.radius = randomInt;

  }
}

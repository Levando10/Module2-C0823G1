package ss3.quadraticequation;

public class QuadraticEquation {

  private double a;
  private double b;
  private double c;

  public QuadraticEquation(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;

  }

  public double getRoot1() {
    return ((-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a);


  }

  public double getRoot2() {

    return ((-b - Math.sqrt(b * b - 4 * a * c)) / 2 * a);

  }

  public double getDiscriminant() {
    return b * 2 - 4 * a * c;
  }


}

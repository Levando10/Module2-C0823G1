package ss6.baitap.CircleAndCylinder;

public class test {

  public static void main(String[] args) {
    Circle circle = new Circle(4, "red");
    System.out.println(circle);
    Cylinder cylinder = new Cylinder(3, "blue", 5);
    System.out.println(cylinder);

    System.out.println(cylinder.getAreaSurrounding());
    System.out.println(cylinder.getAreaOFTwoCircular());
    System.out.println(cylinder.totalArea());
    System.out.println(cylinder);
    System.out.println(cylinder.getVolume());
  }
}

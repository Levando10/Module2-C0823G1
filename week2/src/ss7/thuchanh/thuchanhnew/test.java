package ss7.thuchanh.thuchanhnew;

public class test {

  public static void main(String[] args) {
    Circle circle = new Circle("red", true, 12);
    Rectangle rectangle = new Rectangle("yellow", true, 8, 5);

    System.out.println(circle);
    System.out.println(rectangle);
    System.out.println(rectangle.getPerimeter());
    System.out.println(rectangle.getArea());
   
  }
}

package ss7.baitap.resizeable;


public class Test {

  public static void main(String[] args) {
    Shape circle = new Circle(2);
    Shape rectangle = new Rectangle(12, 10);
    Shape square = new Square(4);
    Shape[] list = {circle, rectangle, square};
    System.out.println("Trước khi sắp xếp !!!");
    for (Shape shape : list) {
      if (shape instanceof Circle) {
        Circle circle1 = (Circle) shape;
        System.out.println("Diện tích hình tròn là : " + circle1.getArea());
      } else if (shape instanceof Rectangle) {
        Rectangle rectangle1 = (Rectangle) shape;
        System.out.println("Diện tích hình chữ nhật là : " + rectangle1.getArea());
      } else {
        Square square1 = (Square) shape;
        System.out.println("Diện tích hình vuông là : " + square1.getArea());
      }

    }
    System.out.println("Sau khi sắp xếp !!!");
    for (Shape shape : list) {
      if (shape instanceof Circle) {
        Circle circle1 = (Circle) shape;
        circle1.resize(50);
        System.out.println("Diện tích hình tròn là : " + circle1.getArea());
      } else if (shape instanceof Rectangle) {
        Rectangle rectangle1 = (Rectangle) shape;
        rectangle1.resize(40);
        System.out.println("Diện tích hình chữ nhật là : " + rectangle1.getArea());
      } else {
        Square square1 = (Square) shape;
        square1.resize(120);
        System.out.println("Diện tích hình vuông là : " + square1.getArea());
      }

    }


  }
}

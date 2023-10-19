package ss7.baitap.colorable;

public class Test {

  public static void main(String[] args) {
    Object newCircle1 = new Circle(1);
    Object newRectangle = new Rectangle(10, 6);
    Object newSquare1 = new Square(5);
    Object newSquare2 = new Square(10);
    Object newCircle2 = new Circle(8);
    Object[] list = {newCircle1, newSquare2, newRectangle, newSquare1, newCircle2};

    for (int i = 0; i < list.length; i++) {
      if (list[i] instanceof Circle) {
        System.out.println("Diện tích hình tròn là :  " + ((Circle) list[i]).getArea());
      } else if (list[i] instanceof Square) {
        System.out.println("Diện tích hình vuông là : " + ((Square) list[i]).getArea());
        System.out.println("Thông điệp : " + ((Square) list[i]).howToColor());
      } else {
        System.out.println("Diện tích hình chữ nhật là : " + ((Rectangle) list[i]).getArea());
      }
    }


  }
}

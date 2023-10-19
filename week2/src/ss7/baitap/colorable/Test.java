package ss7.baitap.colorable;

public class Test {

  public static void main(String[] args) {
    Object newCircle1 = new NewCircle(1);
    Object newRectangle = new NewRectangle(10, 6);
    Object newSquare1 = new NewSquare(5);
    Object newSquare2 = new NewSquare(10);
    Object newCircle2 = new NewCircle(8);
    Object[] list = {newCircle1, newSquare2, newRectangle, newSquare1, newCircle2};

    for (int i = 0; i < list.length; i++) {
      if (list[i] instanceof NewCircle) {
        System.out.println("Diện tích hình tròn là :  " + ((NewCircle) list[i]).getArea());
      } else if (list[i] instanceof NewSquare) {
        System.out.println("Diện tích hình vuông là : " + ((NewSquare) list[i]).getArea());
        System.out.println("Thông điệp : " + ((NewSquare) list[i]).howToColor());
      } else {
        System.out.println("Diện tích hình chữ nhật là : " + ((NewRectangle) list[i]).getArea());
      }
    }


  }
}

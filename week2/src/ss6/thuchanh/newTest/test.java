package ss6.thuchanh.newTest;

public class test {

  public static void main(String[] args) {
    Square square = new Square();
    System.out.println(square);

    square = new Square(6);
    System.out.println(square);

    square = new Square("pink", true, 12);
    System.out.println(square);
  }
}

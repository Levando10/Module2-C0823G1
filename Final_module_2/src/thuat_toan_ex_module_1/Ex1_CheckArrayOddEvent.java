package thuat_toan_ex_module_1;

public class Ex1_CheckArrayOddEvent {

  public static void main(String[] args) {
    System.out.print("Nhập độ dài của mảng: ");
    Integer lengthArr = Validate.checkInputInteger();
    int[] arr = new int[lengthArr];
    Integer countOdd = 0;
    Integer countEvent = 0;
    Integer number;

    for (int i = 0; i < lengthArr; i++) {
      System.out.print("Nhập phần tử thứ " + " : ");
      number = Validate.checkInputInteger();
      arr[i] = number;
      if (arr[i] % 2 == 0) {
        countEvent++;
      } else {
        countOdd++;
      }
    }

    if (countEvent == countOdd) {
      System.out.println("OK");
    } else {
      System.out.println("No");
    }

  }

}

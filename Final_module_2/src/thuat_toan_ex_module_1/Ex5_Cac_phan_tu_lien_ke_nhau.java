package thuat_toan_ex_module_1;

public class Ex5_Cac_phan_tu_lien_ke_nhau {

  public static void main(String[] args) {
    int lengthArr;
    System.out.print("Nhập độ dài của mảng: ");
    lengthArr = Validate.checkInputInteger();
    while (lengthArr % 2 != 0) {
      System.out.print("Nhập độ dài số chẵn: ");
      lengthArr = Validate.checkInputInteger();
    }
    int[] arrCheck = new int[lengthArr];
    for (int i = 0; i < arrCheck.length; i++) {
      System.out.print("Nhập phần tử thứ " + i + " : ");
      arrCheck[i] = Validate.checkInputInteger();
    }

    boolean check = true;
    for (int i = 0; i < lengthArr; i = i + 2) {
      for (int j = i + 1; j < i + 1 + 1; j++) {
        if (arrCheck[i] > arrCheck[i + 1]) {
          check = false;
        }
      }
      if (check == false) {
        break;
      }
    }

    if (check) {
      System.out.println("Ok");
    } else {
      System.out.println("No");
    }

  }

}

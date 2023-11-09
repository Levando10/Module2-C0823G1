package thuat_toan_ex_module_1;

public class checkDoiXungBai1 {

  public static void main(String[] args) {
    int [] arr = new int[]{0,1,2,1,1,0};
    boolean check = true;
    for (int i = 0; i < arr.length/2; i++) {
    if (arr[i] != arr[arr.length - 1 - i]){
      check = false;
    }
    }
    if (check){
      System.out.println("ok");
    } else {
      System.out.println("No");
    }
  }
}

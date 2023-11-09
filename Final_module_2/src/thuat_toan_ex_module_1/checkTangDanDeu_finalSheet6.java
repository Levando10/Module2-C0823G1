package thuat_toan_ex_module_1;

public class checkTangDanDeu_finalSheet6 {

  public static void main(String[] args) {
int[] arr = new int[]{0,2,4,6,8};

int checkIncrease = arr[1] - arr[0];
boolean flag = true;

    for (int i = 1; i < arr.length - 1; i++) {
      if (arr[i] != arr[i - 1] + checkIncrease ){
        flag = false;
      }
    }

    if (flag){
      System.out.println("Ok");
    } else {
      System.out.println("No");
    }



  }
}

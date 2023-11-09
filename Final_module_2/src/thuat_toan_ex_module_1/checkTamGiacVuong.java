package thuat_toan_ex_module_1;

public class checkTamGiacVuong {

  public static void main(String[] args) {
    checkTriangle(4.0, 12.0, 10.0);


  }

  private static void checkTriangle(double x, double y, double z) {
    if (x <= 0 || y <= 0 || z <= 0) {
      System.out.println("Không phải là 1 cạnh của tam giác");
    }else if (x + y <= z || x + z <= y || z + y <= x){
      System.out.println("Không phải là 1 cạnh của  tam giác");
    }else {
      if (x * x + y * y == z*z ||x * x + z * z == y *y || z * z  + y * y == x * x  ){
        System.out.println("Là ba cạnh của 1 tam giác vuông!!!");
      } else {
        System.out.println("chỉ là 3 cạnh của 1 tam giác");
      }
    }


  }


}

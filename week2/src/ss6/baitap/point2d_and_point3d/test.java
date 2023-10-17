package ss6.baitap.point2d_and_point3d;

import java.util.Arrays;

public class test {

  public static void main(String[] args) {
    Point2D point2D = new Point2D(12, 3);
    System.out.println(point2D);
    Point3D point3D = new Point3D(5, 7, 8);

    System.out.println(point3D.toString());
    System.out.println(Arrays.toString(point3D.getXYZ()));
  }
}

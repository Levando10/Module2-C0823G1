import java.io.File;
import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {


    File dir = new File("Books"); // tao 1 thu muc
    dir.mkdir();
    java.io.File file = new java.io.File("Books/xinchao.txt"); // tao 1 file text


    if (file.exists()) {

      System.out.println("File already exists");

    }

     java.io.PrintWriter output = new java.io.PrintWriter(file);

    output.print("nhật bảo ");

     output.println(90);

     output.print("Tuấn thành  ");

     output.println(85);

  output.close(); // 0 co close thi khong ket thuc va ko co hien thi thông tin trong file




     }
}
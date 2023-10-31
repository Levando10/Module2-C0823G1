package ss16.bai_tap.data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class testDataInput {

  public static void main(String[] args) throws FileNotFoundException {



    //ghi dữ liệu vào file temp.dat với DataOutputStream
    try ( DataOutputStream output = new DataOutputStream(new FileOutputStream("wk4/src/ss16/bai_tap/data/out.dat"))) {
      output.writeUTF("Tuấn");
      output.writeDouble(85.5);
      output.writeUTF("Nasus");
      output.writeDouble(185.5);
      output.writeUTF("Kim");
      output.writeDouble(105.25);
      output.close();
    } catch (IOException e) {
      e.printStackTrace();
    }


    //đọc dữ liệu từ file temp.dat với DataInputStream
    try (  DataInputStream input = new DataInputStream(new FileInputStream("wk4/src/ss16/bai_tap/data/out.dat"))) {

//      System.out.println(input.readUTF() + " " + input.readDouble());
//      System.out.println(input.readUTF() + " " + input.readDouble());
//      System.out.println(input.readUTF() + " " + input.readDouble());
      while (true) {
        System.out.println(input.readUTF() + " " + input.readDouble());
      }

    } catch (EOFException e){
      System.out.println("All data were read");

    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}

package ss16.bai_tap.baitesst;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestInputStream {

  public static void main(String[] args) throws IOException {
    ObjectOutputStream  in = null;

//viet
    try {
       in = new ObjectOutputStream(new FileOutputStream("wk4/src/ss16/bai_tap/baitesst/codegym.csv"));
      Student student = new Student(91,83);

       in.writeObject(student);
       in.flush();


    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    finally {
      in.close();
    }



    //doc
    ObjectInputStream oip = null;
    try {
      oip = new ObjectInputStream(new FileInputStream("wk4/src/ss16/bai_tap/baitesst/codegym.csv"));
      Student student = (Student) oip.readObject();
      System.out.println(student);

    } catch (IOException e) {
      throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
    finally {
      oip.close();
    }


  }
}

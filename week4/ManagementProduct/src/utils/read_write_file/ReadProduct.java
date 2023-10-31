package utils.read_write_file;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import models.Product;

public class ReadProduct {

  private static final String PATH = "ManagementProduct/src/data/ListProduct.csv";

  public static List<Product> readProductList() {
    List<Product> productList = null;
    FileInputStream fileInputStream = null;
    ObjectInputStream objectInputStream = null;

    try {

      fileInputStream = new FileInputStream(PATH);
      objectInputStream = new ObjectInputStream(fileInputStream);
      productList = (List<Product>) objectInputStream.readObject();
      objectInputStream.close();
    }
    catch (EOFException e){
      System.out.println("Tệp ko chứa dưx liệu");
    }
    catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    } finally {
      try {

        fileInputStream.close();
      } catch (IOException e) {
        e.printStackTrace();
      }

    }
    System.out.println();
 return productList == null? new ArrayList<>(): productList;
  }

}

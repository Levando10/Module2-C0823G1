package utils.read_write_file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import models.Product;

public class WriteProduct {
  private static final String PATH = "ManagementProduct/src/data/ListProduct.csv";
  public static void writeProductObject(List<Product> products){
    FileOutputStream fileOutputStream = null;
    ObjectOutputStream objectOutputStream = null;

    try {
      fileOutputStream = new FileOutputStream(PATH);
      objectOutputStream = new ObjectOutputStream(fileOutputStream);
      objectOutputStream.writeObject(products);



    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      try {
        fileOutputStream.close();
        objectOutputStream.close();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }

    }

  }
}

package utils.read_write_file;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
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
      if (productList.isEmpty()){
        return null;
      }
    }
    catch (EOFException e){
      //
    }
    catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
    finally {
      try {
        objectInputStream.close();
        fileInputStream.close();
      } catch (IOException e) {
        e.printStackTrace();
      }

    }

    return productList;
  }

}

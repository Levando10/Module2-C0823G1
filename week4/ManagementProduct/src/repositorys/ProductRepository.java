package repositorys;

import java.util.ArrayList;
import java.util.List;
import models.Product;
import utils.read_write_file.ReadProduct;
import utils.read_write_file.WriteProduct;

public class ProductRepository implements IProductRepository {

  public static List<Product> products = new ArrayList<>();


  @Override
  public List<Product> getAllProduct() {
    products = ReadProduct.readProductList();
    WriteProduct.writeProductObject(products);
    return ReadProduct.readProductList();

  }

  @Override
  public void addProduct(Product product) {
    products.add(product);
    WriteProduct.writeProductObject(products);
  }

  @Override
  public Product searchProduct(String name) {
    products = ReadProduct.readProductList();
    for (Product temp : products){
      if (temp.getName().toLowerCase().contains(name.toLowerCase())){
        return temp;

      }
    }
    return null;
  }

  @Override
  public Boolean findId(Integer id) {

    products = ReadProduct.readProductList();
    for (Product temp : products){
      if (temp.getId().equals(id)){

        return true;
      }
    }
    return false;
  }
}

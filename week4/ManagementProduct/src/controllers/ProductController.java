package controllers;

import java.util.List;
import models.Product;
import services.IProductService;
import services.ProductService;

public class ProductController {

  private IProductService iProductService = new ProductService();

  public List<Product> getAllProduct() {

   return iProductService.getAllProduct();
  }


  public void addProduct(Product product) {
    iProductService.addProduct(product);
  }


  public Product searchProduct(String name) {
    return iProductService.searchProduct(name);
  }
}

package ss11.bai_tap.use_araylist_linkedlist.controller;

import ss11.bai_tap.use_araylist_linkedlist.service.IProductService;
import ss11.bai_tap.use_araylist_linkedlist.service.ProductService;

public class ProductController implements IProductService {

  IProductService iProductService = new ProductService();


  @Override
  public void addProduct() {
    iProductService.addProduct();
  }

  @Override
  public void showProduct() {
    iProductService.showProduct();
  }

  @Override
  public void editProduct() {
    iProductService.editProduct();
  }

  @Override
  public void deleteProduct() {
    iProductService.deleteProduct();
  }

  @Override
  public void findProduct() {
    iProductService.findProduct();
  }

  @Override
  public void sortProduct() {
    iProductService.sortProduct();
  }
}

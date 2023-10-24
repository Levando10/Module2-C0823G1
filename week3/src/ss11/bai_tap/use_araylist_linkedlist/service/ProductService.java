package ss11.bai_tap.use_araylist_linkedlist.service;

import ss11.bai_tap.use_araylist_linkedlist.reposility.IProductManager;
import ss11.bai_tap.use_araylist_linkedlist.reposility.ProductManager;

public class ProductService implements IProductService {

  IProductManager iProductManager = new ProductManager();

  @Override
  public void addProduct() {
    iProductManager.addProduct();
  }

  @Override
  public void showProduct() {
    iProductManager.showProduct();
  }

  @Override
  public void editProduct() {
    iProductManager.editProduct();
  }

  @Override
  public void deleteProduct() {
    iProductManager.deleteProduct();
  }

  @Override
  public void findProduct() {
    iProductManager.findProduct();
  }

  @Override
  public void sortProduct() {
    iProductManager.sortProduct();
  }
}

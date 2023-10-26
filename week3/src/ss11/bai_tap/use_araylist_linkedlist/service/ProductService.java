package ss11.bai_tap.use_araylist_linkedlist.service;

import ss11.bai_tap.use_araylist_linkedlist.repository.IProductRepository;
import ss11.bai_tap.use_araylist_linkedlist.repository.ProductRepository;

public class ProductService implements IProductService {

  private IProductRepository iProductManager = new ProductRepository();

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

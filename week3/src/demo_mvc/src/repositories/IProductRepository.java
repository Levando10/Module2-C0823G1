package repositories;

import models.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAll();

    void save(Product product);

    Product findById(Integer id);

    void deleteById(Integer id);
    void editById(Integer id);

    void findProduct(String name);

    void sortProduct();
}

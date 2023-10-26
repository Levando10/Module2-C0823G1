package services.impl;

import models.Product;
import repositories.IProductRepository;
import repositories.impl.ProductRepository;
import services.IProductService;

import java.util.List;

public class ProductService implements IProductService {
    private IProductRepository productRepository = new ProductRepository();

    @Override
    public List<Product> getAll() {
        return productRepository.getAll();
    }

    @Override
    public void createProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public Boolean removeProduct(Integer id) {
        Product product = productRepository.findById(id);
        if(product == null) {
            return false;
        } else {
            productRepository.deleteById(id);
            return true;
        }

    }

    @Override
    public Boolean editProduct(int id) {
        Product product = productRepository.findById(id);
        if (product == null){
            return false;
        } else {
            productRepository.editById(id);
            return true;
        }


    }

    @Override
    public void findProduct(String name) {
        productRepository.findProduct(name);

    }

    @Override
    public void sortProduct() {
        productRepository.sortProduct();
    }


}

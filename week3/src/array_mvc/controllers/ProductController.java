package array_mvc.controllers;

import models.Product;
import services.IProductService;
import services.impl.ProductService;

import java.util.List;

public class ProductController {
    private IProductService productService = new ProductService();
    public List<Product> getAll() {
        return productService.getAll();
    }

    public void addProduct(Product product) {
        productService.createProduct(product);
    }

    public Boolean removeProduct(Integer id) {
        return productService.removeProduct(id);
    }



    public Boolean editProduct(Integer id) {

        return productService.editProduct(id);
    }

    public void findProduct(String name) {
        productService.findProduct(name);
    }

    public void sortProduct() {
        productService.sortProduct();
    }
}

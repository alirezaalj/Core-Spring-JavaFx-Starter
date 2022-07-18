package ir.alirezaalijani.product.manager.application.service;

import ir.alirezaalijani.product.manager.application.data.Product;

public interface ProductService {
    boolean addNewProduct(Product product);
    boolean updateProduct(Product product);
    boolean deleteProduct(int id);
}

package ir.alirezaalijani.javafx.application.service;

import ir.alirezaalijani.javafx.application.data.Product;

public interface ProductService {
    boolean addNewProduct(Product product);
    boolean updateProduct(Product product);
    boolean deleteProduct(int id);
}

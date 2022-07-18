package ir.alirezaalijani.javafx.application.repositories;

import ir.alirezaalijani.javafx.application.data.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}

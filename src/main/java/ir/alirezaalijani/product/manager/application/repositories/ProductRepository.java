package ir.alirezaalijani.product.manager.application.repositories;

import ir.alirezaalijani.product.manager.application.data.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}

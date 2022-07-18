package ir.alirezaalijani.javafx.application.repositories;

import ir.alirezaalijani.javafx.application.data.Factor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactorRepository extends JpaRepository<Factor,Integer> {
}

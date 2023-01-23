package am.kanachsnund.kanachsnund.repository;

import am.kanachsnund.kanachsnund.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}

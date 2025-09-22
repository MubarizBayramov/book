package az.example.book.repository;

import az.example.book.entity.Buyer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuyerRepository extends JpaRepository <Buyer, Long> {
}

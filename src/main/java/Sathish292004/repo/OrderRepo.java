package Sathish292004.repo;

import Sathish292004.model.Order;
import Sathish292004.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrderRepo extends JpaRepository<Order, Integer> {
    Optional<Order> findByOrderId(String orderId);
}

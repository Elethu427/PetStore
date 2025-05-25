package za.ac.cput.repository.cart;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.cart.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {

}

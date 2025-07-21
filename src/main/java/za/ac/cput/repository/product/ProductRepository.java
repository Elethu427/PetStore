package za.ac.cput.repository.product;
/*Oluhle Makhaye
* 222419636*/

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.product.Product;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByProductName(String productName);
    Product findByProductID(Integer productID);
}

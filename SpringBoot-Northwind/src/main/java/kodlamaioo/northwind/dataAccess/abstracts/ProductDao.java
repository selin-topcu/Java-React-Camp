package kodlamaioo.northwind.dataAccess.abstracts;

import kodlamaioo.northwind.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product,Integer> {
    
}

package kodlamaioo.northwind.business.abstracts;

import kodlamaioo.northwind.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
}

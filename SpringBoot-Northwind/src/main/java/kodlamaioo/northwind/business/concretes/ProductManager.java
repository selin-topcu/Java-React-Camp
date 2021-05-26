package kodlamaioo.northwind.business.concretes;

import kodlamaioo.northwind.business.abstracts.ProductService;
import kodlamaioo.northwind.dataAccess.abstracts.ProductDao;
import kodlamaioo.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service //BU class service görevini görecek
public class ProductManager implements ProductService {

    private ProductDao productDao;

    @Autowired //autowired injection
    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public List<Product> getAll() {
        return this.productDao.findAll();
    }
}

package kodlamaioo.northwind.api.controllers;

import kodlamaioo.northwind.business.abstracts.ProductService;
import kodlamaioo.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

    @Autowired //IOC kendi referansını buluyor tekrar new yazmaya gerek kalmadan kendisi işlemleri yapar
    private ProductService productService;
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }



    @GetMapping("/getall") //getall diye bir istekte bulunursak aşağıdaki kod çalışacak
    public List<Product> getAll() {
        return this.productService.getAll();
    }

}

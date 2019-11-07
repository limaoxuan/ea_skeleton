package edu.mum.ea_product.controller;

import edu.mum.ea_product.entity.Product;
import edu.mum.ea_product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/publish")
    public Product publish(@RequestBody Product product){
        return productService.save(product);
    }

    @GetMapping("/all")
    public List<Product> all(){
        return productService.getAllProducts();
    }

    @GetMapping("/all/{vendorId}")
    public List<Product> allByVendorId(@PathVariable("vendorId") String vendorId){
        return productService.getAllProductsByVendorId(vendorId);
    }
}

package edu.mum.ea_product.service;

import edu.mum.ea_common.IdWorker;
import edu.mum.ea_product.dao.ProductDao;
import edu.mum.ea_product.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private IdWorker idWorker;

    @Autowired
    private ProductDao productDao;
    public List<Product> getAllProducts(){
        return productDao.findAll();
    }

    public Product getProductById(String id){
        Optional<Product> product = productDao.findById(id);
        if (product.isPresent())
            return product.get();
        else
            return null;
    }

    public Product save(Product product){
        product.setId( idWorker.nextId()+"");
        return productDao.save(product);
    }

    public List<Product> getAllProductsByVendorId(String vendorId){
        return productDao.findProductsByVendorId(vendorId);
    }
}

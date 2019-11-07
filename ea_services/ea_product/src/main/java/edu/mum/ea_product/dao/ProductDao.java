package edu.mum.ea_product.dao;

import edu.mum.ea_product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao extends JpaRepository<Product,String>, JpaSpecificationExecutor<Product> {
    public List<Product> findProductsByVendorId(String vendorId);
}

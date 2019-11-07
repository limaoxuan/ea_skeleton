package edu.mum.ea_product.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@Table(name = "product")
public class Product {
    @Id
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "vendor_id")
    private String vendorId;
    @Column(name = "category")
    private String category;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "pic")
    private String pic;
    @Column(name = "price")
    private Float price;

}

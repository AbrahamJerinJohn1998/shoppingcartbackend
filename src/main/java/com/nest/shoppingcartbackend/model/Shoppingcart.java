package com.nest.shoppingcartbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "shoppingcart")
public class Shoppingcart {
    @Id
    @GeneratedValue

}

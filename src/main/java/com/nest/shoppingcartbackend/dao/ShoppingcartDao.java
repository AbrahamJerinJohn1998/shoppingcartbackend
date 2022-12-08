package com.nest.shoppingcartbackend.dao;

import com.nest.shoppingcartbackend.model.Shoppingcart;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ShoppingcartDao extends CrudRepository<Shoppingcart,Integer> {
    @Query(value = "SELECT `id`, `category`, `description`, `image`, `name`, `price` FROM `product` WHERE `name` LIKE %:name%",nativeQuery = true)
    List<Shoppingcart> SearchProduct(@Param("name") String name);
}

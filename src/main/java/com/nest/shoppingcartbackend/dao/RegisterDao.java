package com.nest.shoppingcartbackend.dao;

import com.nest.shoppingcartbackend.model.UserRegister;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RegisterDao extends CrudRepository<UserRegister,Integer> {
    @Query(value = "SELECT `id`, `address`, `confirmPassword`, `emailId`, `name`, `password`, `phone`,'userName' FROM `userregister` WHERE `userName`= :userName AND `password`= :password",nativeQuery = true)
    List<UserRegister> UserLogin(@Param("userName") String userName , @Param("password") String password);
}

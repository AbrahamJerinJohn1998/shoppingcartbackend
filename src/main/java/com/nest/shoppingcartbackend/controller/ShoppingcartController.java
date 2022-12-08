package com.nest.shoppingcartbackend.controller;


import com.nest.shoppingcartbackend.dao.RegisterDao;
import com.nest.shoppingcartbackend.dao.ShoppingcartDao;
import com.nest.shoppingcartbackend.model.Shoppingcart;
import com.nest.shoppingcartbackend.model.UserRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ShoppingcartController {
    @Autowired
    private ShoppingcartDao dao;
    @Autowired
    private RegisterDao d;
    @CrossOrigin("*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public Map<String,String> AddProduct(@RequestBody Shoppingcart s)
    {
        System.out.println(s.getName().toString());
        System.out.println(s.getImage().toString());
        System.out.println(s.getCategory().toString());
        System.out.println(s.getPrice());
        System.out.println(s.getDescription().toString());
        dao.save(s);
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Shoppingcart> ViewProduct()
    {
        return (List<Shoppingcart>) dao.findAll();
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search",consumes = "application/json",produces = "application/json")
    public List<Shoppingcart> SearchProduct(@RequestBody Shoppingcart s)
    {
        String name=s.getName().toString();
        System.out.println(name);
        return (List<Shoppingcart>) dao.SearchProduct(s.getName());
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/userreg",consumes = "application/json",produces = "application/json")
    public Map<String,String> UserRegister(@RequestBody UserRegister u)
    {
        System.out.println(u.getName().toString());
        System.out.println(u.getAddress().toString());
        System.out.println(u.getPhoneno());
        System.out.println(u.getEmailId().toString());
        System.out.println(u.getUserName().toString());
        System.out.println(u.getPassword().toString());
        System.out.println(u.getConfirmPassword().toString());
        d.save(u);
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;

    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/userlogin",consumes = "application/json",produces = "application/json")
    public List<UserRegister> UserLogin(@RequestBody UserRegister u)
    {
        String userName=u.getUserName().toString();
        String password=u.getPassword().toString();
        System.out.println(userName);
        System.out.println(password);
        return (List<UserRegister>) d.UserLogin(u.getUserName(),u.getPassword());
    }
}


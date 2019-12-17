package com.shanghai.unicom.micro.smartcrud.service;

import com.shanghai.unicom.micro.smartcrud.domain.Customer;
import com.shanghai.unicom.micro.smartcrud.domain.User;

import java.util.List;


public interface UserService {

     /**
      * 查找用户接口
      * @return
      */
     List<User> findUserByName();


     Customer addCustInfo(Customer customer);



}

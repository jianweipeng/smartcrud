package com.shanghai.unicom.micro.smartcrud.repository;


import com.shanghai.unicom.micro.smartcrud.domain.Customer;
import com.shanghai.unicom.micro.smartcrud.domain.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Mapper
public interface UserMapper {


    /**
     * 查询用户信息
     */

    List<User> selectUserinfo();

    /**
     *新增客户信息
     */
    void addCustfInfo(Customer customer);




}

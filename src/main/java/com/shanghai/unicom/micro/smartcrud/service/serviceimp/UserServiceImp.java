package com.shanghai.unicom.micro.smartcrud.service.serviceimp;

import com.shanghai.unicom.micro.smartcrud.domain.Customer;
import com.shanghai.unicom.micro.smartcrud.domain.User;
import com.shanghai.unicom.micro.smartcrud.repository.UserMapper;
import com.shanghai.unicom.micro.smartcrud.service.UserService;
import com.shanghai.unicom.micro.smartcrud.utils.DateGetUtil;
import com.shanghai.unicom.micro.smartcrud.utils.IdGeneratorUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserServiceImp implements UserService {



    @Autowired
    private UserMapper userMapper;

    @Autowired
    private IdGeneratorUtil idGeneratorUtil;

    @Autowired
    private DateGetUtil dateGetUtil;


    @Override
    public List<User> findUserByName(){

        return userMapper.selectUserinfo();
    }

    /**
     * 新增客户信息
     * @param customer
     * @return
     */
    @Override
    public Customer addCustInfo(Customer customer) {

        customer.setCustId(idGeneratorUtil.getCustIdCode());
        customer.setAcctId(idGeneratorUtil.getAcctIdCode());
        customer.setStatus("0");
        customer.setInDate(dateGetUtil.getCurrentTime());
        log.info(customer.toString());

        userMapper.addCustfInfo(customer);
        return  customer;

    }
}





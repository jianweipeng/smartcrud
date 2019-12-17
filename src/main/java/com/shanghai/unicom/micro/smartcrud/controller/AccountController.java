package com.shanghai.unicom.micro.smartcrud.controller;


import com.shanghai.unicom.micro.smartcrud.domain.Customer;
import com.shanghai.unicom.micro.smartcrud.domain.User;
import com.shanghai.unicom.micro.smartcrud.service.UserService;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "账户操作")
@RestController
@Slf4j
@RequestMapping(value = "/v1")
public class AccountController {


    @Autowired
    private UserService userService;




    @ApiOperation(value = "查询用户列表信息")
    @RequestMapping(value = "/selectuser", method = RequestMethod.GET)
    public List<User> findUser() {
        return userService.findUserByName();
    }


    /**
     * 入参为实体类的子集
     * @param { "custName":"jianwei",
     *          "psptId":"123",
     *          "psptType":"1"
     *          }
     * @return
     */
    @ApiOperation(value = "新增客户")
    @RequestMapping(value = "/addcustinfo",method = RequestMethod.POST)
    public Customer addCustInfo(  @RequestBody  Customer customer){
        log.info(customer.toString());
        //校验用户的证件号码参数不为空
        if(customer.getPsptId() == null || customer.getPsptId().equals("")){
            log.info(customer.toString());
            log.info("is null ,out!!!");
            return null;
        }else {
            //增加客户信息
            log.info(customer.toString());
            userService.addCustInfo(customer);

        }

        return customer;
    }



    public void modifyCustInfo() {

    }

    public void modifyAcctInfo() {

    }


}

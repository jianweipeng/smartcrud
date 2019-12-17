package com.shanghai.unicom.micro.smartcrud.controller;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HealthCheck {

    /**
     * 此控制用于健康检查
     * @return
     */
    @ApiOperation(value = "健康检查" ,notes="该控制器用于健康检查")
    @RequestMapping(value = "/health",method = RequestMethod.GET)
    public String healthCheck(){
        return "this project is health";
    }



    /**
     * 多路由请求
     * @return
     */
    @RequestMapping(value = {
            "/hello",
            "helloworld",
            "/"
    },method = RequestMethod.GET)
    public String Helloworld(){
        return "hello mult path";
    }


    @ApiOperation(value = "Swagger API TEST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "account_id", value = "添加的bss/cbss账户ID", required = true),
            @ApiImplicitParam(name = "telphone", value = "业务操作电话", required = true),
            @ApiImplicitParam(name = "address", value = "联系地址", required = true)
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "ok"),
            @ApiResponse(code = 800, message = "添加失败")
    })
    @RequestMapping(value = "/addaccount/{account_id}/{telphone}/{address}",
            method = RequestMethod.POST)
    public boolean addUser(@RequestParam int account_id,
                           int telphone, String address) {
        return true;
    }


}

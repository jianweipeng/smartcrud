package com.shanghai.unicom.micro.smartcrud.utils;


import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Random;


@Component
@Slf4j
@Data
//@ConfigurationProperties(prefix = "systemCode")
public  class  GetFixLenthRandom {

    @Value("${systemCode.fixLenth}")
    private Integer fixLenth ;


    /**
     * 获取固定长度的随机数 注意，固定长度小于6位
     *
     * @return
     */
    public  String getFixLenthRandomString(){
        Random rd = new Random();

        double randomNumber = (1+rd.nextDouble())*Math.pow(10,fixLenth);
        //数字转字符串
        String randomString = String.valueOf(randomNumber);

        return randomString.substring(1,fixLenth+1);

    }

}

package com.shanghai.unicom.micro.smartcrud.config;


import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
@Component
@Slf4j
public class MyconfigTest {

    @Autowired
    private MyConfig myConfig;


    @Test
    public  void myConfigTest(){
       log.info(myConfig.toString());
    }

}

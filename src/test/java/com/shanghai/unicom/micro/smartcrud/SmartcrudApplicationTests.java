package com.shanghai.unicom.micro.smartcrud;

import com.shanghai.unicom.micro.smartcrud.config.MyConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SmartcrudApplicationTests {

    @Autowired
    private MyConfig myConfig;

    @Test
    public void contextLoads() {
    }


    @Test
    public  void myConfigTest(){
        System.out.println(myConfig.toString());
    }

}

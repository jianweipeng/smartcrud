package com.shanghai.unicom.micro.smartcrud.utils;

import com.shanghai.unicom.micro.smartcrud.config.MyConfig;
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
public class GetFixLenthRandomTest {

    @Autowired
    private GetFixLenthRandom getFixLenthRandom;

    @Test
    public void getFixLenthRandomStringTest(){

        log.info(getFixLenthRandom.getFixLenthRandomString());
    }



}

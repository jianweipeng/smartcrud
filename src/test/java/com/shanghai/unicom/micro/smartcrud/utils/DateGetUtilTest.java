package com.shanghai.unicom.micro.smartcrud.utils;


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
public class DateGetUtilTest {

    @Autowired
    private DateGetUtil dateGetUtil;

    @Test
    public void getTimeStampTest(){
        log.info(dateGetUtil.getTimeStamp());
        log.info(dateGetUtil.getTimeStampyyyyMMdd());

    }



}

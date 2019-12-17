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
public class IdGeneratorUtilTest {

    @Autowired
    private IdGeneratorUtil idGeneratorUtil;

    @Test
    public void getUserIdCodeTest(){
        log.info(idGeneratorUtil.getUserIdCode());
    }

    @Test
    public void getCustIdCodeTest(){
        log.info(idGeneratorUtil.getCustIdCode());
    }

    @Test
    public void getAcctIdCodeTest(){
        log.info(idGeneratorUtil.getAcctIdCode());
    }

}

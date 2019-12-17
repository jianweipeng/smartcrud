package com.shanghai.unicom.micro.smartcrud.service.serviceimp;

import com.shanghai.unicom.micro.smartcrud.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;


@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UserListTest {
    @Test
    public void sayUserList(){
        List<User> userList= new ArrayList<User>();
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        User user4 = new User();
        user1.setUserName("jianwei1");
        user2.setUserName("jianwei2");
        user3.setUserName("jianwei3");
        user4.setUserName("jianwei4");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        System.out.println(userList);


    }
}


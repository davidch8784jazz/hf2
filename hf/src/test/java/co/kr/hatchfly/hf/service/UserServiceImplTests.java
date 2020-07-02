package co.kr.hatchfly.hf.service;

import co.kr.hatchfly.hf.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTests {

    @Autowired
    private UserService userService;

    @Test
    public void testResgistUser(){
        User user = new User("1000","choiy11hoon");
        User res =  userService.registUser(user);


    }
}

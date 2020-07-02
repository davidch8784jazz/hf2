package co.kr.hatchfly.hf.dao;

import co.kr.hatchfly.hf.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTests {

    @Autowired
    private UserRepository userRepository;
    @Test
    public void testGetAllUsers(){

        List<User> res = userRepository.getAllUsers();
        Assert.assertTrue(res.size()>0);


    }

    @Test
    public void testGetUserByUserid(){
        User user = userRepository.getUserByUserid("100");

        Assert.assertNotNull(user);
    }


}

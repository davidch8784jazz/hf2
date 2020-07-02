package co.kr.hatchfly.hf;


import co.kr.hatchfly.hf.auth.NaverOauth;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NaverOauthTest {

    @Autowired
    NaverOauth naverOauth;

    @Test
    public void contextLoads() {
    }


    @Test
    public void naverOauthTest(){
        System.out.println(naverOauth.toString());

    }

}

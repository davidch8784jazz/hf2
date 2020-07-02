package co.kr.hatchfly.hf.controller;

import co.kr.hatchfly.hf.annotation.TokenRequired;
import co.kr.hatchfly.hf.auth.NaverOauth;
import co.kr.hatchfly.hf.auth.SNSLogin;
import co.kr.hatchfly.hf.model.User;
import co.kr.hatchfly.hf.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private static final Logger logger =
            LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @Autowired
    private NaverOauth naverOauth;

    @TokenRequired
    @GetMapping("")
    public List<User> getAllUsers(){

        return userService.getUsers();
    }

    @GetMapping("/{userid}")
    public User getUserByUserid(@PathVariable String userid){
        return userService.getUserById(userid);
    }

    @PostMapping("")
    public void registUser(@RequestBody User user){
        userService.registUser(user);
    }

    @PutMapping("/{userid}")
    public void modifyUser(@PathVariable String userid, @RequestBody User user){
        userService.modifyUser(userid,user);
    }

    @DeleteMapping("/{userid}")
    public void removeUser(@PathVariable  String userid){
        userService.removeUser(userid);
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public void login(Model model) throws Exception {
        logger.info("login GET .....");

        SNSLogin snsLogin = new SNSLogin(naverOauth);
        model.addAttribute("naver_url", snsLogin.getNaverAuthURL());

//		SNSLogin googleLogin = new SNSLogin(googleSns);
//		model.addAttribute("google_url", googleLogin.getNaverAuthURL());

        /* 구글code 발행을 위한 URL 생성 */
      /*  OAuth2Operations oauthOperations = googleConnectionFactory.getOAuthOperations();
        String url = oauthOperations.buildAuthorizeUrl(GrantType.AUTHORIZATION_CODE, googleOAuth2Parameters);
        model.addAttribute("google_url", url);*/
    }

}

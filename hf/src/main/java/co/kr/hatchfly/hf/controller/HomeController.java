package co.kr.hatchfly.hf.controller;

import co.kr.hatchfly.hf.service.SecurityServiceImpl;
import co.kr.hatchfly.hf.service.UserService;
import co.kr.hatchfly.hf.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class HomeController {

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private SecurityServiceImpl securityService;

    @GetMapping("/home")
    public String home(Model model) {
        System.out.println("rrrr1");

        model.addAttribute("name","ddddd");

        return "home";
    }

    /*@GetMapping("")
    public Map<String,String> home(){
        System.out.println("rrrr");
        Map<String,String> res = this.userService.getMessage();

        return res;
    }*/


    @GetMapping("security/generate/token")
    public Map<String, Object> generateToken(@RequestParam String subject) {
        String token = securityService.createToken(subject, 1000 * 60 * 60 * 24L);
        Map<String, Object> map = new HashMap<>();
        map.put("userid", subject);
        map.put("token", token);
        return map;
    }

    @GetMapping("security/get/subject")
    public String getSubject(@RequestParam String token) {
        String subject = securityService.getSubject(token);
        return subject;
    }





}

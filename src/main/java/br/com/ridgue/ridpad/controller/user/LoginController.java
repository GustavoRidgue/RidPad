package br.com.ridgue.ridpad.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @GetMapping("login")
    public String login() {
        return "user/login";
    }

    @PostMapping("logged")
    public String details() {
        return "redirect:home";
    }
}

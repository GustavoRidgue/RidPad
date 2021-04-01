package br.com.ridgue.ridpad.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpController {
    @GetMapping("sign_up")
    public String login() {
        return "user/signup";
    }

    @PostMapping("signed_up")
    public String details() {
        return "redirect:login";
    }
}

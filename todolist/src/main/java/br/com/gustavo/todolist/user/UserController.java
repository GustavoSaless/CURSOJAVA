package br.com.gustavo.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

@PostMapping("/")
    public String create(@RequestBody UserModel userModel ){
        System.out.println(userModel.name);
        return "O usuario " + userModel.name + " Foi cadastrado" ;
    }
}

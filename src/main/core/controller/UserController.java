package main.core.controller;

import main.core.mapper.UserMapper;
import main.core.pojo.User;
import main.core.service.*;
import main.core.service.UserServiceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import main.core.service.UserServiceImpl.*;
import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {

    @Resource(name = "userServiceImpl")
    private UserService userService;

    @RequestMapping(value = "/users/{id}")
    public String d(@PathVariable("id") int i){
        userService.delete(i);
        System.out.println("good");
        return "delete";
    }

    @RequestMapping(value = "/users/s/{name}")
    public String a(@PathVariable("name") String name){
        User user =new User();
        user.setName("sa");
        user.setId(9);
        userService.add(user);
        System.out.println("good");
        return "add";
    }
    @RequestMapping(value = "/news/{name}/{id}")
    public String u(@PathVariable("name") String name,@PathVariable("id") int id){
        User user =new User();
        user.setId(id);
        user.setName(name);
        userService.update(user);
        System.out.println("good");
        return "update";
    }
    @RequestMapping(value = "/users")
    public String l(){
        List list=  userService.list();

        System.out.println(list);
        return "listUser";
    }
}

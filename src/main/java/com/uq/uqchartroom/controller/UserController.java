package com.uq.uqchartroom.controller;

import com.uq.uqchartroom.entities.User;
import com.uq.uqchartroom.service.UserService;
import com.uq.uqchartroom.utils.WebServletUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author pyt
 * @Date 2019/4/2 15:19
 * @Version
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(Model model){
        return "/user/login";
    }

    @RequestMapping("/userList")
    public String userList(Model model){
        model.addAttribute("hello", "Hello,World!");
        model.addAttribute("userList",userService.findAll());
        return "/user/userList";
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(@RequestParam(value = "name") String username, Model model, HttpServletRequest request){
        model.addAttribute("usename", username);
        User user = new User();
        user.setUsername(username);
        user.setUserip(WebServletUtil.getClientIpAddress(request));
        System.out.println(WebServletUtil.getClientIpAddress(request));
        System.out.println(WebServletUtil.getClientIpAddr(request));
        System.out.println(WebServletUtil.getIpAddr(request));
        System.out.println(WebServletUtil.getRemoteAddr(request));
        userService.save(user);
        return "/user/index";
    }
}

package com.herman.controller;

import com.herman.entity.User;
import com.herman.service.impl.UserService;
import org.apache.log4j.Logger;
import org.apache.log4j.lf5.viewer.LogFactor5Dialog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {

    private static Logger log = Logger.getLogger(UserController.class);
    @Resource
    private UserService userService;

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public String list(@PathVariable Integer id, Model model) {
        log.error("user id : " + id);
        User user = this.userService.findUserById(id);
        model.addAttribute("user", user);
        return "userList";
    }
}

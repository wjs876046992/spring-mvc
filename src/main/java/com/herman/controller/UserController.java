package com.herman.controller;

import com.herman.entity.User;
import com.herman.service.impl.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    private static Logger log = Logger.getLogger(UserController.class);
    @Resource
    private UserService userService;

//    @RequestMapping(value="/{id}", method = RequestMethod.GET)
//    public String list(@PathVariable Integer id, Model model) {
//        log.error("user id : " + id);
//        User user = this.userService.findUserById(id);
//        model.addAttribute("user", user);
//        return "userList";
//    }

    @ResponseBody
    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Map<String, Object> findUser(@PathVariable Integer id) {
        Map<String, Object> result = new HashMap<String, Object>();
        User user = this.userService.findUserById(id);
        result.put("data", user);
        return result;
    }
}

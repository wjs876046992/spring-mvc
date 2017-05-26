package com.herman.controller;

import com.herman.entity.Hero;
import com.herman.service.impl.HeroService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("api/heroes")
public class HeroController {

    @Resource
    private HeroService heroService;

    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Map<String, Object> getHeroes() {
        Map<String, Object> result = new HashMap<>();
        List<Hero> list = this.heroService.find();
        result.put("data", result);
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Map<String, Object> getHero(@PathVariable Integer id) {
        Map<String, Object> result = new HashMap<>();
        Hero hero = this.heroService.selectByPrimaryKey(id);
        result.put("data", hero);
        return result;
    }
}

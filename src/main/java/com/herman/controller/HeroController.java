package com.herman.controller;

import com.herman.entity.Hero;
import com.herman.service.IHeroService;
import com.herman.service.impl.HeroService;
import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.json.Json;
import javax.json.JsonObject;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("api/heroes")
public class HeroController {

    @Resource
    private HeroService heroService;

    private static Logger logger = Logger.getLogger(HeroController.class);

    @ResponseBody
    @RequestMapping(value = "", method = RequestMethod.GET)
    public Map<String, Object> getHeroes(HttpServletRequest request) {
        String queryString = request.getQueryString();
        List<Hero> list = null;
        if (StringUtils.isEmpty(queryString)) {
            list = this.heroService.findAll();
        } else {
            String json = com.herman.utils.StringUtils.parseQueryString(queryString);
            try {
                Hero hero = new ObjectMapper().readValue(json, Hero.class);
                list = this.heroService.findSelective(hero);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Map<String, Object> result = new HashMap<>();
        result.put("data", list);
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

    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Map<String, Object> updateHero(@RequestBody Hero hero) {
        Map<String, Object> result = new HashMap<>();
        int count = this.heroService.updateByPrimaryKey(hero);
        result.put("data", count);
        return result;
    }
}

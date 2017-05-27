package com.herman.controller;

import com.herman.entity.Hero;
import com.herman.service.IHeroService;
import com.herman.service.impl.HeroService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
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
    public Map<String, Object> getHeroes() {
        Map<String, Object> result = new HashMap<>();
        List<Hero> list = this.heroService.findAll();
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
    @RequestMapping(value = "/?name={name}", method = RequestMethod.GET)
    public Map<String, Object> getHeroesByName(@PathVariable String name) {
        Map<String, Object> result = new HashMap<>();
        List<Hero> list = this.heroService.findByName(name);
        result.put("data", list);
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Map<String, Object> updateHero(@RequestBody Hero hero) {
        Map<String, Object> result = new HashMap<>();
        logger.info(hero.getName());
        int count = this.heroService.updateByPrimaryKey(hero);
        result.put("data", count);
        return result;
    }
}

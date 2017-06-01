package com.herman.service.impl;

import com.herman.dao.HeroMapper;
import com.herman.entity.Hero;
import com.herman.service.IHeroService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("heroService")
public class HeroService implements IHeroService {

    @Resource
    private HeroMapper heroMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Hero record) {
        return 0;
    }

    @Override
    public int insertSelective(Hero record) {
        return 0;
    }

    @Override
    public Hero selectByPrimaryKey(Integer id) {
        return this.heroMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Hero record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Hero record) {
        return this.heroMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Hero> findByName(String name) {
        return this.heroMapper.findByName(name);
    }

    @Override
    public List<Hero> findAll() {
        return this.heroMapper.findAll();
    }

    @Override
    public List<Hero> findSelective(Hero hero) {
        return this.heroMapper.findSelective(hero);
    }
}

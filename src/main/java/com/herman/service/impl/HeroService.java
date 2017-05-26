package com.herman.service.impl;

import com.herman.dao.HeroMapper;
import com.herman.dao.IUserDao;
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
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Hero record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Hero record) {
        return 0;
    }

    @Override
    public List<Hero> findByName(String name) {
        return null;
    }

    @Override
    public List<Hero> find() {
        return this.heroMapper.find();
    }
}

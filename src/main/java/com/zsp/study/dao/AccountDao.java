package com.zsp.study.dao;

import com.zsp.study.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Daryl on 2020/6/8 14:55
 * 账户dao接口,只用写接口，mybatis会自动生成代理对象直接执行，不用写实现类
 */
@Repository
public interface AccountDao {

    //查询所有账户信息
    //@Select("select * from account")
    public List<Account> findAll();

    //保存账户
    //@Insert("insert into account (name,money) values(#{name},#{money})")
    public void saveAccount(Account account);

}

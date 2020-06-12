package com.zsp.study.service;

import com.zsp.study.domain.Account;

import java.util.List;

/**
 * Created by Daryl on 2020/6/8 15:00
 */
public interface AccountService {

    //查询所有账户信息
    public List<Account> findAll();

    //保存账户
    public void saveAccount(Account account);

}

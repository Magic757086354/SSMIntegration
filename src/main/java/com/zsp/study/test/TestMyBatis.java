package com.zsp.study.test;

import com.zsp.study.dao.AccountDao;
import com.zsp.study.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by Daryl on 2020/6/8 16:56
 */
public class TestMyBatis {

    /**
     * 测试查询
     * @throws IOException
     */
    @Test
    public void run1() throws IOException {
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactoryBuilder factoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = factoryBuilder.build(in);
//        创建SqlSession对象
        SqlSession session = factory.openSession();
//        获取到代理对象
        AccountDao dao = session.getMapper(AccountDao.class);
//        查询所有数据
        List<Account> list = dao.findAll();
        for (Account account : list) {
            System.out.println(account);
        }
//        关闭资源
        session.close();
        in.close();

    }

    /**
     * 测试保存
     * @throws IOException
     */
    @Test
    public void run2() throws IOException {
        Account account = new Account();
        account.setName("lzh");
        account.setMoney(50d);
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactoryBuilder factoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = factoryBuilder.build(in);
//        创建SqlSession对象
        SqlSession session = factory.openSession();
//        获取到代理对象
        AccountDao dao = session.getMapper(AccountDao.class);
//        保存数据
        dao.saveAccount(account);
        //        提交事务
        session.commit();
//        关闭资源
        session.close();
        in.close();

    }

}

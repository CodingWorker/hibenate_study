package com.test.hibernate_study;

import com.test.hibernate_study.model.Employee;
import com.test.hibernate_study.model.Employer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Created by IntelliJ IDEA
 * User:    DaiYan
 * Date:    2017/11/13
 * Project: CodesDemo
 */
public class Main {
    public static void main(String[] args) {
        //create cfg object
        Configuration cfg = new Configuration();
        //config the cfg-file
        cfg.configure("hibernate.cfg.xml");

        //创建会话工厂
        SessionFactory sessionFactory = cfg.buildSessionFactory();

        //创建会话
        Session session = sessionFactory.openSession();

        //创建事务
        Transaction transaction = session.beginTransaction();

        Employee e1 = new Employee();
        e1.setId(200);
        e1.setFirstName("Max");
        e1.setLastName("Su");

        //操作
        session.persist(e1);

        //提交事务
        transaction.commit();

        //关闭连接
        session.close();
        System.out.println("Successfully Stored");
    }

    public static void main1(String[] args) {
        //create cfg
        Configuration cfg = new Configuration();
        //设置配置
        cfg.configure("hibernate.cfg.annotation.xml");

        //创建会话工厂
        SessionFactory sessionFactory=cfg.buildSessionFactory();

        //创建会话
        Session session=sessionFactory.openSession();

        //创建并开启一个事务
        Transaction transaction=session.beginTransaction();

        //准备sql
        Employer employer=new Employer();
        employer.setId(100);
        employer.setFirstName("Min");
        employer.setLastName("Hu");
        session.persist(employer);

        //提交事务
        transaction.commit();

        //关闭session
        session.close();

        //关闭session 工厂
        sessionFactory.close();
        System.out.println("Storing successfully");
    }
}
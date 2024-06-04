package com.app;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.dao.aop.AccountDao;
import com.app.dao.aop.MembershipDao;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        AccountDao theDao= context.getBean("bean1",AccountDao.class);
        MembershipDao memDao= context.getBean("bean2",MembershipDao.class);
        theDao.addAccount();
        memDao.add123();
        System.out.println(theDao.doWork(10, 10));
        System.out.println(memDao.doWork(12, 10));
        context.close();
    }
}

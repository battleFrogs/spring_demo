package com.gjc.web_servlet.service.impl;

import com.gjc.web_servlet.dao.DemoDao;
import com.gjc.web_servlet.factory.BeanFactory;
import com.gjc.web_servlet.service.DemoService;

import java.util.List;

public class DemoServiceImpl implements DemoService {

    //    private DemoDao demoDao = new DemoDaoImpl();
//    private DemoDao demoDao = BeanFactory.getDemoDao();
    private DemoDao demoDao = (DemoDao) BeanFactory.getBean("demoDao");

    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }

}

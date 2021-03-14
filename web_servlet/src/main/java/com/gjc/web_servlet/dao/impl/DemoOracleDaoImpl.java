package com.gjc.web_servlet.dao.impl;

import com.gjc.web_servlet.dao.DemoDao;

import java.util.Arrays;
import java.util.List;

public class DemoOracleDaoImpl implements DemoDao {

    @Override
    public List<String> findAll() {
        return Arrays.asList("oracle1", "oracle2", "oracle3");
    }
}

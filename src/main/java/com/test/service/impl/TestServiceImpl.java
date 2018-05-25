package com.test.service.impl;

import com.google.gson.Gson;
import com.test.dao.KeynMapper;
import com.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    KeynMapper keynMapper;

    public void testdb() throws Exception{
        System.out.println(new Gson().toJson(keynMapper.selectGpCode("TEST")));
    }
}

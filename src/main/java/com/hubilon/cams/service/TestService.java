package com.hubilon.cams.service;

import com.hubilon.cams.entity.Test;
import com.hubilon.cams.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class TestService
{
    @Autowired
    TestMapper testMapper;

    public List<Test> findAll(){

        return testMapper.findAll();
    }
}

package com.mmall.dao;

import com.mmall.BaseTest;
import com.mmall.pojo.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2017/11/16.
 */
public class UserMapperTest extends BaseTest{

    private final Logger logger = LoggerFactory.getLogger(UserMapperTest.class);

    @Autowired
    private UserMapper userMapper;

    @Before
    public void setUp() throws Exception {
        logger.info("start");
    }

    @After
    public void tearDown() throws Exception {
        logger.info("end");
    }

    @Test
    public void testSelectLogin() throws Exception {
        User user = userMapper.selectLogin("admin", "1");
        logger.info("user:" + user);
    }
}
package org.hjfx.service;

import static org.junit.Assert.*;

import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Title:
 * @Description:
 * @Author:wxm
 * @Since:2016年8月15日
 * @Version:1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)// 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class UserServiceTest {
    private static Logger logger = Logger.getLogger(UserServiceTest.class);

    @Autowired
    private UserService userService;
    
    @Transactional
    @Test
    public void test() throws Exception {
        Map<String, Object> result = userService.login("xxq", "123", "1234");
        assertEquals(0, result.get("code"));
    }

}

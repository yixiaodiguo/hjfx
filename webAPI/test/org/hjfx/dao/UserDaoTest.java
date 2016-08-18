/**  
 *UserDaoTest.java         2016年8月15日下午8:00:11
 *@Copyright:Copyright © VIVO Communication Technology Co., Ltd. All rights reserved.
 *@Company:http://www.vivo.com.cn/
 * 
 */
package org.hjfx.dao;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.hjfx.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Title:
 * @Description:
 * @Author:wxm
 * @Since:2016年8月15日
 * @Version:1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)// 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class UserDaoTest {
    private static Logger logger = Logger.getLogger(UserDaoTest.class);

    @Autowired
    private UserMapper userMapper;
    
    @Test
    public void test() {
        User user = userMapper.selectByPrimaryKey(1);
        assertNotNull(user);
    }

}

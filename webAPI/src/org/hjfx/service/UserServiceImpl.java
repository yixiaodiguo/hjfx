/**  
 *UserService.java         2016年8月15日下午8:11:26
 *@Copyright:Copyright © VIVO Communication Technology Co., Ltd. All rights reserved.
 *@Company:http://www.vivo.com.cn/
 * 
 */  
package org.hjfx.service;  

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.hjfx.dao.UserMapper;
import org.hjfx.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
  
  
/**  
 *@Title:  
 *@Description:  用户业务类
 *@Author:wxm 
 *@Since:2016年8月15日  
 *@Version:1.0  
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    
    /**
     * code = 0 验证成功
     * code = 1 验证码为空
     * code = 2 账号不存在
     * code = 3 密码错误
     * @throws Exception 
     */
    @Transactional
    @Override
    public Map<String, Object> login(String username, String password, String code) throws Exception{
        Map<String, Object> result = new HashMap<String, Object>();
        if(StringUtils.isEmpty(code)){
            result.put("code", 1);
            return result;
        }
        User user = userMapper.selectByPrimaryKey(1);
        if(null == user){
            result.put("code", 2); 
            return result;
        }
        user.setAge(100);
        userMapper.updateByPrimaryKey(user);
        int i = 100/0;
        user.setAge(66);
        userMapper.updateByPrimaryKey(user);
        result.put("code", 0);
        return result;
    }
}

/**  
 *UserService.java         2016年8月15日下午8:11:26
 *@Copyright:Copyright © VIVO Communication Technology Co., Ltd. All rights reserved.
 *@Company:http://www.vivo.com.cn/
 * 
 */  
package org.hjfx.service;  

import java.util.Map;
  
  
/**  
 *@Title:  
 *@Description:  
 *@Author:wxm 
 *@Since:2016年8月15日  
 *@Version:1.0  
 */
public interface UserService {

    /**  
     * @Description:  用户登陆操作
     * @param username
     * @param password
     * @param code
     * @return  
     * @throws Exception 
     * @Author:wxm
     * @see:
     * @since: 1.0
     * @Create Date:2016年8月15日
     */
    Map<String, Object> login(String username, String password, String code) throws Exception;

}

package com.gupaoedu.vip.pattern.adapter.loginadapter.v2;

import com.gupaoedu.vip.pattern.adapter.loginadapter.ResultMsg;

/**
 * @author: Mr.Wong
 * @create: 2019-06-29
 **/
public interface IPassportForThird {

    //QQ登录
    ResultMsg loginForQQ(String id);

    //微信登录
    ResultMsg loginForWechat(String id);

    //记住登录状态后自动登录
    ResultMsg loginForToken(String token);

    //手机号登录
    ResultMsg loginForTelphone(String telphone,String code);

    //注册后自动登录
    ResultMsg loginForRegist(String username,String passport);

}

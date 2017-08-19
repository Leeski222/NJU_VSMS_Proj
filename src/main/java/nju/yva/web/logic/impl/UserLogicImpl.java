package nju.yva.web.logic.impl;

import nju.yva.web.data.UserInfo;
import nju.yva.web.logic.BaseLogic;
import nju.yva.web.logic.UserLogic;

/**
 * Created by Water on 2017/8/19.
 */
public class UserLogicImpl extends BaseLogic implements UserLogic {
    /**
     * 用户登录
     * 传进来之后就加密
     * TODO
     *
     * @param id       id是注册的账号
     * @param password 密码是自己设定的
     * @return 登录成功则返回true，否则返回false
     */
    @Override
    public boolean userLogin(String id, String password) {
        return false;
    }

    /**
     * 用户登出
     * TODO
     *
     * @param id 用户的id
     * @return 登出成功则返回true，否则返回false
     */
    @Override
    public boolean userLogout(String id) {
        return false;
    }

    /**
     * 用户注册
     * TODO
     *
     * @param id        提供id
     * @param password  密码
     * @param name      姓名
     * @param telNum    联系方式
     * @param studentNo 学号
     * @return
     */
    @Override
    public boolean userRegister(String id, String password, String name, String telNum, String studentNo) {
        return false;
    }

    /**
     * 修改信息
     * TODO
     *
     * @param modifiedInfo
     * @return
     */
    @Override
    public boolean userModify(UserInfo modifiedInfo) {
        return false;
    }

    /**
     * 通过id获得用户的信息
     * TODO
     *
     * @param id 用户id
     * @return
     */
    @Override
    public UserInfo getUserInfo(String id) {
        return null;
    }
}

package cn.wyedward.singletemplate.service.test;

import cn.wyedward.singletemplate.entity.test.UserDo;

import java.util.List;

public interface UserService {
    //获取用户列表
    List<UserDo> listUsers();
}

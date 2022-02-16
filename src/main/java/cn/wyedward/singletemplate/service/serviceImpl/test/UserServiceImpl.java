package cn.wyedward.singletemplate.service.serviceImpl.test;

import cn.wyedward.singletemplate.entity.test.UserDo;
import cn.wyedward.singletemplate.mapper.test.UserMapper;
import cn.wyedward.singletemplate.service.test.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserDo> listUsers() {
        return userMapper.listUsers();
    }
}

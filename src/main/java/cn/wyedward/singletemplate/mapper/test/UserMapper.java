package cn.wyedward.singletemplate.mapper.test;

import cn.wyedward.singletemplate.entity.test.UserDo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    //获取用户列表
    List<UserDo> listUsers();
}

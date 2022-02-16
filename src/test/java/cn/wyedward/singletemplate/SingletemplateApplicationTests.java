package cn.wyedward.singletemplate;

import cn.wyedward.singletemplate.entity.test.UserDo;
import cn.wyedward.singletemplate.mapper.test.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SingletemplateApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    void contextLoads() {
    }
    @Test
    void testMapper(){
        List<UserDo> userDos = userMapper.listUsers();
        System.out.println(userDos);
    }
}

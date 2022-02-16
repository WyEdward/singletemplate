package cn.wyedward.singletemplate.controller.test;

import cn.wyedward.singletemplate.entity.test.UserDo;
import cn.wyedward.singletemplate.service.test.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@RestController("portalBlogController")
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @PostMapping("/listUsers")
    public List<UserDo> listUsers(){
        return userService.listUsers();
    }

    @RequestMapping("/listUsersTwo")
    public ModelAndView listUsersTwo(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("users", userService.listUsers());
        mv.setViewName("/test/selectUser.html");
        return mv;
    }
}

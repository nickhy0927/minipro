package com.iss.core.platform.user.web;

import com.iss.core.platform.user.pojo.User;
import com.iss.core.utils.JSONResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {

    @RequestMapping(value = "/platform/user/userList.do", method = RequestMethod.GET)
    public String userList(Model model) {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setLoginName("1" + i);
            user.setPassword("123456" + i);
            user.setLastLoginTime(new Date());
            users.add(user);
        }
        model.addAttribute("users", users);
        return "platform/user/userList";
    }

    @RequestMapping(value = "/platform/roleList/roleList.do", method = RequestMethod.GET)
    public String roleList(Model model) {
        User user = new User();
        user.setLoginName("1");
        user.setPassword("123456");
        user.setLastLoginTime(new Date());
        model.addAttribute("user", user);
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user1 = new User();
            user1.setLoginName("1" + i);
            user1.setPassword("123456" + i);
            user1.setLastLoginTime(new Date());
            users.add(user1);
        }
        model.addAttribute("users", users);
        return "platform/user/roleList";
    }

    @RequestMapping(value = "/platform/user/getInfos.json", method = RequestMethod.GET)
    @ResponseBody
    public Object getInfos() {
        User user = new User();
        user.setLoginName("1");
        user.setPassword("123456");
        user.setLastLoginTime(new Date());
        return JSONResult.success(user);
    }
}

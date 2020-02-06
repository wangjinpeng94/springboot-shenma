package cn.sm1234.controller;

import cn.sm1234.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
@Controller
public class UserController {
    @RequestMapping("/list")
    public String list(Model model){
        List<User> list = new ArrayList<>();
       list.add(new User("wang", 18));
        list.add(new User("li", 20));
        list.add(new User("jiang", 16));

        //把数据存入model
        model.addAttribute("list",list);
        //跳转到freemarker 页面list.ftl
        //跳转到jsp 页面list.jsp
        return "list";

    }

}

package cn.sm1234.controller;

import cn.sm1234.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ThymeleafController {
    @RequestMapping("/demo1")
    public  String thymeleafDemo(Model model){
        model.addAttribute("message","你好");
        return  "demo1";
    }


    @RequestMapping("/demo2")
    public  String thymeleafDemo2(Model model){
        model.addAttribute("name","laowang");
        return  "demo1";
    }

    @RequestMapping("/demo3")
    public  String thymeleafDemo3(Model model){
        model.addAttribute("gender","男");
        return  "demo1";
    }



    @RequestMapping("/demo4")
    public  String thymeleafDemo4(Model model){
        model.addAttribute("grade",3);
        return  "demo1";
    }

//迭代遍历
    @RequestMapping("/demo5")
    public  String thymeleafDemo5(Model model){
        List<User> list=new ArrayList<User>();
        list.add(new User("wang",18));
        list.add(new User("li",20));
        list.add(new User("jiang",16));
        model.addAttribute("list",list);
        return  "demo1";
    }


    @RequestMapping("/demo6")
    public  String thymeleafDemo6(HttpServletRequest request,Model model){
 //request
        request.setAttribute("request","request's data");
        //session
        request.getSession().setAttribute("session","session's data");

        //application
        request.getSession().getServletContext().setAttribute("application","application's data");
        return  "demo1";
    }
//超链接语法
    @RequestMapping("/demo7")
    public  String thymeleafDemo7(HttpServletRequest request,Model model){

        return  "demo1";
    }
}

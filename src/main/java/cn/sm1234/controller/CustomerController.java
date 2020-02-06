package cn.sm1234.controller;

import cn.sm1234.domain.Customer;
import cn.sm1234.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Resource
    private CustomerService customerService;
    @RequestMapping("/save")
    public String save(Customer customer){
        System.out.println(123);
        System.out.println("name:"+customer.getName());
        customerService.save(customer);
        System.out.println(456);
        return "succ";
    }


    //跳转到input.html页面
    @RequestMapping("/input")
    public  String input(){
        return "input";
    }

}

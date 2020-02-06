package cn.sm1234;

import cn.sm1234.servlet.HelloFilter;
import cn.sm1234.servlet.HelloListener;
import cn.sm1234.servlet.HelloServlet;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@ServletComponentScan
@MapperScan("cn.sm1234.dao")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }


    //注册servlet程序
    @Bean
    public ServletRegistrationBean getServletRegistrationBean(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new HelloServlet());
        bean.addUrlMappings("/helloServlet");
        return bean;
    }
   //注册filter
   @Bean
   public FilterRegistrationBean getFilterRegistrationBean(){
       FilterRegistrationBean filter = new FilterRegistrationBean(new HelloFilter());
       filter.addUrlPatterns("/helloServlet");
       return filter;
   }

   //注册listener
    @Bean
    public ServletListenerRegistrationBean<HelloListener> getServletListenerRegistrationBean(){
        ServletListenerRegistrationBean<HelloListener> listener = new ServletListenerRegistrationBean<HelloListener>(new HelloListener());

        return listener;
    }
}

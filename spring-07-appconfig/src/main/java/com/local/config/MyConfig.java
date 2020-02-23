package com.local.config;


import com.local.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Configuration: 这个也会被spring容器托管，注册到容器中，因为他本来就是一个 @Component
 * 这个注解就是一个配置类，和之前的 bean.xml 一样
 */
@Configuration(value = "MyConfig")
@ComponentScan("com.local.pojo")
@Import(MyConfig2.class)
public class MyConfig {

    //注册一个 bean, 就相当于我们之前写的一个 bean 标签
    //方法名就相当于 bean 标签的 id属性
    //方法的返回值相当于 bean 标签的 class 属性
    @Bean
    public User getUser() {
        return new User();  //就是返回要注入到bean的对象
    }
}

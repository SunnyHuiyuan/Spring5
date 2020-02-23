package com.local.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class People {


    private String name;

    /**
    @Autowired：直接在属性上使用即可，也可以在set上使用
    使用Autowired不用编写set方法，前提是自动装配的属性在IOC(Spring)容器中存在，且符合名字byName

     Autowired:先通过byType查找，找不到再通过byName查找，而且必须要求这个对象存在
     Resources:先通过byName查找，找不到再通过byType查找,两个都找不到则报错
     */
    //如果显示的定义了required=false,说明这个对象可以为null,否则不允许为空
    @Autowired
    @Qualifier(value = "cat1")
    private Cat cat;

    @Resource(name = "dog2")
    private Dog dog;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", cat=" + cat +
                ", dog=" + dog +
                '}';
    }
}

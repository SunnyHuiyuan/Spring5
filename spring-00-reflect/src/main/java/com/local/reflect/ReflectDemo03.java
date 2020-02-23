package com.local.reflect;

import com.local.domain.Person;

import java.lang.reflect.Constructor;

/**
 * 使用Class对象获取构造方法
 */
public class ReflectDemo03 {
    public static void main(String[] args) throws Exception {
        //0、获取Person的Class的对象
        Class personClass = Person.class;

        //* Constructor<T> getConstructor(类<?>... parameterTypes)
        Constructor constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);

        //使用构造方法来创建一个对象
        Object person = constructor.newInstance("张三", 34);
        System.out.println(person);

        //-------------------------------------------------

        Constructor constructor1 = personClass.getConstructor();
        System.out.println(constructor1);

        //使用构造方法来创建一个对象
        Object person1 = constructor1.newInstance();
        System.out.println(person1);


        //空参构造器时，可以直接使用Class.newInstance
        Object o = personClass.newInstance();
        System.out.println(o);

    }
}

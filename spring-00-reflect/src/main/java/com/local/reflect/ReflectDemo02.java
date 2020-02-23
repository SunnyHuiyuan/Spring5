package com.local.reflect;

import com.local.domain.Person;

import java.lang.reflect.Field;

/**
 * * Class对象功能：
 * 	* 获取功能：
 * 		1. 获取成员变量们
 * 			* Field[] getFields() ：获取所有public修饰的成员变量
 * 			* Field getField(String name)   获取指定名称的 public修饰的成员变量
 *
 * 			* Field[] getDeclaredFields()  获取所有的成员变量，不考虑修饰符
 * 			* Field getDeclaredField(String name)
 * 		2. 获取构造方法们
 * 			* Constructor<?>[] getConstructors()
 * 			* Constructor<T> getConstructor(类<?>... parameterTypes)
 *
 * 			* Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
 * 			* Constructor<?>[] getDeclaredConstructors()
 * 		3. 获取成员方法们：
 * 			* Method[] getMethods()
 * 			* Method getMethod(String name, 类<?>... parameterTypes)
 *
 * 			* Method[] getDeclaredMethods()
 * 			* Method getDeclaredMethod(String name, 类<?>... parameterTypes)
 *
 * 		4. 获取全类名
 * 			* String getName()
 */
public class ReflectDemo02 {
    public static void main(String[] args) throws Exception {
        //0、获取Person的Class(字节码)对象
        Class personClass = Person.class;

        //1、Field[] getFields(),获取所有public修饰的成员变量
        Field[] fields = personClass.getFields();
        for (Field field:fields){
            System.out.println(field);
        }

        System.out.println("-------------------------");

        Field a = personClass.getField("a");
        Person person=new Person();
        //获取成员变量a的值
        Object value = a.get(person);
        System.out.println(value);

        //设置a的值
        a.set(person,"张三");
        System.out.println(person);

        System.out.println("----------------------------");

        //Field[] getDeclaredFields()  获取所有的成员变量，不考虑修饰符
        Field[] declaredFields = personClass.getDeclaredFields();
        for(Field field:declaredFields){
            System.out.println(field);
        }

        //* Field getDeclaredField(String name)
        Field d = personClass.getDeclaredField("d");

        //忽略访问权限修饰符的安全检查
        d.setAccessible(true);//暴力反射

        Object value2 = d.get(person);
        System.out.println(value2);
    }
}

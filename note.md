###配置文件模板
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">
</beans>
```
###自动装配的配置模板
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        https://www.springframework.org/schema/context/spring-context.xsd">

    <!--开启注解的支持-->
    <context:annotation-config/>
</beans>
```
###注解说明
- @Autowired:先通过byType查找，找不到再通过byName查找，而且必须要求这个对象存在
    如果Autowired不能唯一自动装配上属性，则需要通过@Qualifier(value="xxx"")
- @Nullable:字段标记了这个注解，则说明这个字段可以为null
- @Resources:先通过byName查找，找不到再通过byType查找,两个都找不到则报错

- @Component:组件，放在类上，说明这个类被spring管理了，成为bean

###P命名空间需要导入的约束
```
导入约束： xmlns:p="http://www.springframework.org/schema/p"

<!--P(属性: properties)命名空间 , 属性依然要设置set方法-->
<bean id="user" class="com.kuang.pojo.User" p:name="狂神" p:age="18"/>
```

###C命名空间需要导入的约束
```
导入约束 : xmlns:c="http://www.springframework.org/schema/c"
<!--C(构造: Constructor)命名空间 , 属性依然要设置set方法-->
<bean id="user" class="com.kuang.pojo.User" c:name="狂神" c:age="18"/>
```
###使用注解需导入的文件头
```
在spring配置文件中引入context文件头
xmlns:context="http://www.springframework.org/schema/context"

http://www.springframework.org/schema/context
http://www.springframework.org/schema/context/spring-context.xsd

开启属性注解支持：
<context:annotation-config/>

```

import com.local.pojo.Student;
import com.local.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * DI:依赖注入
 */
public class MyTest {
    public static void main(String[] args) {
        //拿到上下文
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }

    /**
     * 1.单例模式：（spring默认机制）每次从容器中取出id相同bean是同一个对象
     * 2.原型模式：每次从容器中get的时候，都会产生一个新的对象
     * 3.其余的request,session,application、这些只能在web开发中使用到
     */
    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user1 = context.getBean("user1", User.class);
        User user2 = context.getBean("user2", User.class);

        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user1 == user2);
    }
}

import com.local.pojo.User;
import com.local.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

        // spring 容器，在配置文件被加载时，容器中管理的对象就已经初始化了！
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserT user = (UserT) context.getBean("user2");
        user.show();
    }
}

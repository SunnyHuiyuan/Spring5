import com.local.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

       /* // new 业务层
        // 用户实际调用的是业务层， dao 层他们不需要接触
        UserService userService = new UserServiceImpl();

        ((UserServiceImpl) userService).setUserDao(new UserDaoMysqlImpl());

        userService.getUser();
        */

        //获取 ApplicationContext;拿到 spring 的容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //容器在手，天下我有，需要什么就get 什么!
        UserServiceImpl userService = (UserServiceImpl) context.getBean("userServiceImpl");
        userService.getUser();

    }
}

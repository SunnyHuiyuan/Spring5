import com.local.mapper.UserMapper;
import com.local.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);

        List<User> usersList = userMapper.selectUser();
        for (User user : usersList) {
            System.out.println(user);
        }

    }
}

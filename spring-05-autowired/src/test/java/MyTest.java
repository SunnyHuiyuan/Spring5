import com.local.pojo.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        People people=context.getBean("people",People.class);

        people.getDog().shout();
        people.getCat().shout();
    }
}

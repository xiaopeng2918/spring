import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.yxp2918.pojo.Hello;

/**
 * @author yxp2918
 * @date 2021-10-10-8:23
 */
public class HelloTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString()); // Hello{str='helloSpring'}
    }
}

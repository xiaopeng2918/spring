import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.yxp2918.pojo.Hello;

/**
 * @author yxp2918
 * @date 2021-10-10-8:55
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Hello hello1 = (Hello) context.getBean("hello1");
        Hello hello2 = (Hello) context.getBean("hello2");
        Hello hello3 = (Hello) context.getBean("hhh");

        System.out.println(hello1.toString());
        System.out.println(hello2.toString());
        System.out.println(hello3.toString());
        System.out.println(hello1 == hello3);
    }
}

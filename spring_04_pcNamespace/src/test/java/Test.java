import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.yxp2918.pojo.Student;

/**
 * @author yxp2918
 * @date 2021-10-10-10:14
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Student student1 = context.getBean("student1", Student.class);
        Student student2 = context.getBean("student2", Student.class);
        System.out.println(student1);
        System.out.println(student2);
        //Student{name='yxp', age=18}
        //Student{name='yxp2918', age=20}


    }
}

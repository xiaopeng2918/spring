import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.yxp2918.pojo.Student;

/**
 * @author yxp2918
 * @date 2021-10-10-9:30
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Student student1 = (Student) context.getBean("student1");
//        System.out.println(student1.getName());
        System.out.println(student1.toString());
        // Student{name='yxp', address=top.yxp2918.pojo.Address@1d16f93d, books=[水浒传, 三国演义, 西游记, 红楼梦], hobbies=[敲代码, 学习], card={学生卡=65656565, 身份证=65312312123656565}, games=[LOL, CF, DNF], wife='', info={性别=男, 身高=188, 体重=120}}
    }
}

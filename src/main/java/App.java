import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLOutput;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanTwo =
                (HelloWorld) applicationContext.getBean("helloworld");


        Cat catFirst = (Cat) applicationContext.getBean("cat");
        Cat catSecond = (Cat) applicationContext.getBean("cat");

        System.out.println("HelloWorld bean: " + (bean == beanTwo));
        System.out.println("Cat bean: " + (catFirst == catSecond));
    }
}
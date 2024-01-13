package XmlConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
class NormalClass {

}



public class XmlConfiguration {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("contextConfiguration.xml");
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
    }
}

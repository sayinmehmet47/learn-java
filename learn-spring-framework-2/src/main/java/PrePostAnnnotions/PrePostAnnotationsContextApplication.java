package PrePostAnnnotions;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
class SomeClass {
    private SomeDependency someDependecy;

    public SomeClass(SomeDependency someDependecy) {
        super();
        this.someDependecy = someDependecy;
        System.out.println("All deps are ready");
    }


    @PostConstruct
    public void initialize() {
        someDependecy.getReady();
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("Cleanup");
    }
}


@Component
class SomeDependency {
    public void getReady() {
        System.out.println("Some logic using SomeDependency");
    }
}


@Configuration
@ComponentScan()
public class PrePostAnnotationsContextApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(PrePostAnnotationsContextApplication.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

    }
}

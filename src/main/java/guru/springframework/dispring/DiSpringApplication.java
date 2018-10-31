package guru.springframework.dispring;

import guru.springframework.dispring.controllers.ConstructorInjectedController;
import guru.springframework.dispring.controllers.MyController;
import guru.springframework.dispring.controllers.PropertyInjectedController;
import guru.springframework.dispring.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiSpringApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiSpringApplication.class, args);

        MyController controller = ctx.getBean("myController", MyController.class);

        System.out.println(controller.sayHello());

        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }
}


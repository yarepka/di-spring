package guru.springframework.dispring;

import guru.springframework.dispring.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiSpringApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiSpringApplication.class, args);

        MyController controller = ctx.getBean("myController", MyController.class);
        controller.hello();
    }
}


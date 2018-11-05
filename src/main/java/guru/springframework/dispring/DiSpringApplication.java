package guru.springframework.dispring;

import guru.springframework.dispring.controllers.MyController;
import guru.springframework.dispring.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//@ComponentScan(basePackages = "guru")
public class DiSpringApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiSpringApplication.class, args);
        MyController controller = ctx.getBean("myController", MyController.class);

        FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
        System.out.println("username: " + fakeDataSource.getUser());
        System.out.println("password: " + fakeDataSource.getPassword());
        System.out.println("DBurl: " + fakeDataSource.getUrl());

    }
}


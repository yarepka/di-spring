package guru.springframework.dispring;

//import guru.springframework.dispring.controllers.MyController;
import guru.springframework.dispring.examplebeans.FakeDataSource;
import guru.springframework.dispring.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//@ComponentScan(basePackages = "guru")
public class DiSpringApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiSpringApplication.class, args);
        //MyController controller = ctx.getBean("myController", MyController.class);

        FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
        System.out.println("data.username: " + fakeDataSource.getUser());
        System.out.println("data.password: " + fakeDataSource.getPassword());
        System.out.println("data.dBurl: " + fakeDataSource.getUrl());

        FakeJmsBroker fakeJmsBroker = ctx.getBean(FakeJmsBroker.class);
        System.out.println("jms.username: " + fakeJmsBroker.getUsername());
        System.out.println("jms.password: " + fakeJmsBroker.getPassword());
        System.out.println("jms.url: " + fakeJmsBroker.getUrl());

    }
}


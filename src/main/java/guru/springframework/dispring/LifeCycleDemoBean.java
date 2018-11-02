package guru.springframework.dispring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware,
        BeanFactoryAware, ApplicationContextAware{

    // #0
    public LifeCycleDemoBean() {
        System.out.println("## I'm in the LifeCycleBean Constructor");
    }

    // #1
    @Override
    public void setBeanName(String name) {
        System.out.println("## My Bean Name is: " + name);
    }

    // #2
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## Bean Factory has been set");
    }

    // #3
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## Application context has been set");
    }

    // #4 - called by Post Processor before bean initialization method
    public void beforeInit() {
        System.out.println("## - Before Init - Called by Bean Post Processor");
    }

    // #5 - called after the bean was constructed, but before it's returned to the requesting object.-
    @PostConstruct
    public void postConstruct() {
        System.out.println("## The Post Construct annotated method has been called");
    }

    // #6
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## The LifeCycleBean has its properties set!");
    }

    // #7 - called by Post Processor after bean initialization
    public void afterInit() {
        System.out.println("## - After init called by Bean Post Processor");
    }

    // #8
    @PreDestroy
    public void preDestroy() {
        System.out.println("## The Predestroy annotated method has been called");
    }

    // #9
    @Override
    public void destroy() throws Exception {
        System.out.println("## The Lifecycle bean has been terminated");
    }


}

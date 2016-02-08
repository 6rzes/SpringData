package PureSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by pm on 11/12/15.
 */


public class Startowa {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("pure-spring-config.xml");
//        BeanA beanA = ctx.getBean(BeanA.class);
//        System.out.println(beanA.getU());
        BeanB beanB = ctx.getBean(BeanB.class);
        beanB.useResources();
        ctx.close();
    }
}

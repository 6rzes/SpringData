package JpaLevel1;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;


public class Startowa {
    public static void main(String[] args) {

//        dodatkowy niepotrzebny komentarz

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("jpa-spring-config.xml");



        ctx.close();
    }
}

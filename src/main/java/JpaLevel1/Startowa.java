package JpaLevel1;


import Model.Circle;
import dao.JdbcDaoImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;


public class Startowa {
    public static void main(String[] args) {

        Circle circle = new JdbcDaoImpl().getCircle(0);
//        System.out.println(circle.getName());

    }
}

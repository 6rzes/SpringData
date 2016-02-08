package JpaLevel1;

import JpaLevel1.Domain.Person;
import JpaLevel1.Domain.PersonRepo;
import PureSpring.BeanB;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;


public class Startowa {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("jpa-spring-config.xml");

        PersonRepo personRepo = ctx.getBean(PersonRepo.class);

        int rnd = new Random().nextInt(100);
        Person nowaOsoba = new Person();
        nowaOsoba.setName("Gall Anonim " + rnd);
        nowaOsoba.setAlias("Galius " + rnd);
        System.out.println("przed persist: " + nowaOsoba);
        personRepo.save(nowaOsoba);
        System.out.println("po persist (patrz id): " + nowaOsoba);

        for(Person p : personRepo.findAll()) {
            System.out.println(p);
        }

        System.out.println("----------------");
        for(Person p : personRepo.findByName("Kwalski Jan")) {
            System.out.println(p);
        }


        ctx.close();
    }
}

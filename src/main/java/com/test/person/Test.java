package com.test.person;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Rafi on 13/09/2016.
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        PersonService personService = ctx.getBean(PersonService.class);
            personService.fun();
        ctx.close();
    }
}

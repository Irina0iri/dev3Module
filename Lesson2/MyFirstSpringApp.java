package Lesson2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFirstSpringApp{

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // create the object
        ITeacher theTeacher = context.getBean("myTeacher",ITeacher.class);

        // use the object
        System.out.println(theTeacher.getHomework());

        context.close();
    }

}

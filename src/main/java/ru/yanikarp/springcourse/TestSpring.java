package ru.yanikarp.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        //1
//
//        //Create spring application context
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//          "applicationContext.xml"
//        );
//
//        //Get bean of spring application context
//        TestBean testBean = context.getBean("testBean", TestBean.class);
//
//        System.out.println(testBean.getName());
//
//        context.close();

        //2
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
          "applicationContext.xml"
        );

        MusicPlayer mp = context.getBean("musicPlayer", MusicPlayer.class);

        mp.playMusic();

    }
}

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
        MusicPlayer mp1 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer mp2 = context.getBean("musicPlayer", MusicPlayer.class);

        mp1.setVolume(10);

        System.out.println(mp1.getVolume());
        System.out.println(mp2.getVolume());

        //mp1.playMusic();
        //mp2.playMusic();
    }
}

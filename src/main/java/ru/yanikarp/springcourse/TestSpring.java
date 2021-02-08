package ru.yanikarp.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        //Create spring application context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        //1

//        //Get bean of spring application context
//        TestBean testBean = context.getBean("testBean", TestBean.class);
//
//        System.out.println(testBean.getName());
//
//        context.close();

        //2
        /*
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
        */
        //3

        /*
        * Если у бина стоит scope - prototype, то он не вызывает destroy method в отличии от singletone
        * Даже, если мы используем фабричный метод, при scope - singletone, то паттерн будет использован, т.е паттерн исполняется во всем своем виде
        * */

        ClassicalMusic classicalMusic = context.getBean("musicBeanClassic", ClassicalMusic.class);
        classicalMusic.getSong( );
        context.close();




    }
}

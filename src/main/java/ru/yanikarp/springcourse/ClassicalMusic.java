package ru.yanikarp.springcourse;

public class ClassicalMusic implements Music{

    private ClassicalMusic(){

    }

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Mozart";
    }

    public void _init_(){
        System.out.println("!!! Do initialization !!! ");
    }

    public void _destory_(){
        System.out.println("!!! Do destroy !!!");
    }
}

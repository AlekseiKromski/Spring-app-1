package ru.yanikarp.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private List<Music> musicList = new ArrayList<>();
    private Music music;
    private String name;
    private int volume;

    //IoC
    public MusicPlayer(Music music){
        this.music = music;
    }

    //No args constructor
    public MusicPlayer() {

    }

    public void playMusic(){
        System.out.println("Playing: " + this.music.getSong());
    }

    public void playMusicList() {
        for(int i = 0; i < this.musicList.size(); i++){
            System.out.println(this.musicList.get(i).getSong());
        }
    }


    //Getters and setters
    public void setMusic(Music music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }
}


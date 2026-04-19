package oop.abstraction.Interfaces.mediaPlayerSimulator;

public class Song implements Playable {
    //fields
    private String title;
    private String artist;
    private int duration;

    //constructor
    Song(String title,String artist,int duration){
        this.title=title;
        this.artist=artist;
        this.duration=duration;
    }
    //getters
    public String getArtist(){
        return this.artist;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public int getDuration() {
        return this.duration;
    }



    //methods
    @Override
    public void play() {
        System.out.println("Playing song: "+this.getTitle()+" by "+this.getArtist());
    }

    @Override
    public void pause() {
        System.out.println("Paused song");
    }

    @Override
    public void stop() {
        System.out.println("Stopped playing song");
    }


}

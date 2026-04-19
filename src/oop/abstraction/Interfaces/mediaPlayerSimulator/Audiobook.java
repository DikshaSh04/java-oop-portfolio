package oop.abstraction.Interfaces.mediaPlayerSimulator;

public class Audiobook implements Playable {
    //fields
    private String title;
    private String author;
    private int duration;
    private int chapter;

    //constructor
    Audiobook(String title,String author,int duration,int chapter){
        this.title=title;
        this.author=author;
        this.duration=duration;
        this.chapter=chapter;

    }
    //getters
    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int getDuration() {
        return duration;
    }

    public String getAuthor(){
        return author;
    }

    public int getChapter(){
        return chapter;
    }


    //methods
    @Override
    public void play() {
        System.out.println("Playing audiobook: "+this.getTitle()+" chapter #"+this.getChapter()+" by "+this.getAuthor());

    }

    @Override
    public void pause() {
        System.out.println("Audiobook paused");

    }

    @Override
    public void stop() {
        System.out.println("Stopped playing audiobook");

    }


}

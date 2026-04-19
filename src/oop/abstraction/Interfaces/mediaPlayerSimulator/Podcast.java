package oop.abstraction.Interfaces.mediaPlayerSimulator;

public class Podcast implements Playable{
    //fields
    private String title;
    private String host;
    private int duration;
    private int episodeNumber;

    //constructor
    Podcast(String title,String host,int duration,int episodeNumber){
        this.title=title;
        this.host=host;
        this.duration=duration;
        this.episodeNumber=episodeNumber;
    }

    //getters
    @Override
    public String getTitle(){
        return title;
    }

    @Override
    public int getDuration(){
        return duration;
    }

    public String getHost(){
        return host;
    }

    public int getEpisodeNumber(){
        return episodeNumber;
    }

    //methods
    @Override
    public void play(){
        System.out.println("Playing podcast: "+this.getTitle()+" episode #"+this.getEpisodeNumber()+" by "+this.getHost());
    }

    @Override
    public void pause(){
        System.out.println("Podcast paused");
    }

    @Override
    public void stop(){
        System.out.println("Stopped playing podcast");
    }


}

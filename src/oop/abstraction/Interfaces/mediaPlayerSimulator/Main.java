package oop.abstraction.Interfaces.mediaPlayerSimulator;

public class Main {
    public static void main(String[] args) {
        //objects
        Playable obj1=new Song("Bohemian Rhapsody","Queen",120);
        Playable obj2=new Podcast("The Business Podcast","Joe Smith",1200,32);
        Playable obj3=new Audiobook("Dune","Frank Herbert",1500,6);

        //array
        Playable[] playables=new Playable[3];

        //data
        playables[0]=obj1;
        playables[1]=obj2;
        playables[2]=obj3;

        //loop
        for(int i=0;i<playables.length;i++){
            playables[i].play();
            System.out.println("Duration: " + playables[i].getDuration() + "s");
            playables[i].stop();


        }




    }
}

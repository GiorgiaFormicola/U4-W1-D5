package entities;

import interfaces.Audible;

public class Audio extends MediaObject implements Audible {
    //ATTRIBUTES LIST AS AUDIBLE
    private int length;
    private int volume;

    //CONSTRUCTORS LIST
    public Audio(String title, int length) {
        super(title); //AS READABLE
        this.length = length; // AS AUDIBLE
        this.volume = 5; //AS AUDIBLE
    }

    //METHODS LIST AS READABLE + AUDIBLE
    public void play() {
        for (int i = 0; i < this.length; i++) {
            System.out.println(this.title + "!".repeat(this.volume));
        }
    }

    //METHODS LIST AS AUDIBLE
    public void turnDownVolume() {
        if (volume > 0) {
            volume--;
        } else {
            System.out.println("Volume already at minimum value");
        }
    }

    public void turnUpVolume() {
        if (volume < 10) {
            volume++;
        } else {
            System.out.println("Volume already at maximum value");
        }
    }

    @Override
    public void read() {
        play();
    }

    @Override
    public String toString() {
        return "Audio {" +
                "title: " + title +
                ", length: " + length + " minutes" +
                ", volume: " + volume + "/10" +
                '}';
    }
}

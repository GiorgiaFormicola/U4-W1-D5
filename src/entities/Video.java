package entities;

import interfaces.Audible;
import interfaces.Viewable;

public class Video extends MediaObject implements Audible, Viewable {
    //ATTRIBUTES LIST AS AUDIBLE
    private int length;
    private int volume;

    //ATTRIBUTES LIST AS VIEWABLE
    private int brightness;

    //CONSTRUCTORS LIST
    public Video(String title, int length) {
        super(title); // AS READABLE
        this.length = length; // AS AUDIBLE
        this.volume = 5;      // AS AUDIBLE
        this.brightness = 5; //AS VIEWABLE
    }

    ;

    //METHODS LIST AS READABLE + AUDIBLE
    public void play() {
        for (int i = 0; i < this.length; i++) {
            System.out.println(this.title + "!".repeat(this.volume) + "*".repeat(this.brightness));
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

    //METHODS LIST A VIEWABLE
    public void turnDownBrightness() {
        if (brightness > 0) {
            brightness--;
        } else {
            System.out.println("Brightness already at minimum value");
        }
    }

    public void turnUpBrightness() {
        if (brightness < 10) {
            brightness++;
        } else {
            System.out.println("Brightness already at maximum value");
        }
    }

    @Override
    public void read() {
        play();
    }

    @Override
    public String toString() {
        return "Video {" +
                "title: " + title +
                ", length: " + length + " minutes" +
                ", volume: " + volume + "/10" +
                ", brightness: " + brightness + "/10" +
                '}';
    }
}

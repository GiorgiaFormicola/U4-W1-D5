package entities;

public class Video extends MediaObject {
    //ATTRIBUTES LIST AS PLAYABLE
    private int length;
    private int volume;

    //ATTRIBUTES LIST AS SHOWABLE;
    private int brightness;

    //CONSTRUCTORS LIST;
    public Video(String title, int length, int brightness) {
        super(title); // AS READABLE
        this.length = length; // AS PLAYABLE
        this.volume = 5;      // AS PLAYABLE
        this.brightness = 5; //AS SHOWABLE
    }

    //METHODS LIST AS READABLE + PLAYABLE;
    public void play() {
        for (int i = 0; i < this.length; i++) {
            System.out.println(this.title + "!".repeat(this.volume) + "*".repeat(this.brightness));
        }
    }

    //METHODS LIST AS PLAYABLE
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

    //METHODS LIST A SHOWABLE
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

}

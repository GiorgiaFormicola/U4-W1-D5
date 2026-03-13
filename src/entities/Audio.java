package entities;

public class Audio extends MediaObject {
    //ATTRIBUTES LIST AS PLAYABLE
    private int length;
    private int volume;

    //CONSTRUCTORS LIST
    public Audio(String title, int length) {
        super(title);
        this.length = length;
        this.volume = 5;
    }

    //METHODS LIST AS READABLE + PLAYABLE
    public void play() {
        for (int i = 0; i < this.length; i++) {
            System.out.println(this.title + "!".repeat(this.volume));
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

    @Override
    public void read() {
        play();
    }


}

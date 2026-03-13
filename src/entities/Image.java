package entities;

public class Image extends MediaObject {
    //ATTRIBUTES LIST AS SHOWABLE
    private int brightness;

    //CONSTRUCTORS LIST
    public Image(String title, int brightness) {
        super(title); // AS READABLE
        this.brightness = 5; //AS SHOWABLE
    }

    //METHODS LIST AS READABLE + SHOWABLE
    public void show() {
        System.out.println(this.title + "*".repeat(this.brightness));
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

    @Override
    public void read() {
        show();
    }


}

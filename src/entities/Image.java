package entities;

public class Image extends MediaObject {
    //ATTRIBUTES LIST AS VIEWABLE
    private int brightness;

    //CONSTRUCTORS LIST
    public Image(String title) {
        super(title); // AS READABLE
        this.brightness = 5; //AS VIEWABLE
    }

    //METHODS LIST AS READABLE + VIEWABLE
    public void show() {
        System.out.println(this.title + "*".repeat(this.brightness));
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
        show();
    }

    @Override
    public String toString() {
        return "Image {" +
                "title: " + title +
                ", brightness: " + brightness + "/10" +
                '}';
    }

}

import entities.Audio;
import entities.Image;
import entities.MediaObject;
import entities.Video;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Audio media1 = new Audio("Audio", 4);
        Video media2 = new Video("Video", 6);
        Image media3 = new Image("Image");

        MediaObject[] mediaList = {media1, media2, media3};

        for (MediaObject currentMedia : mediaList) {
            currentMedia.read();
        }

        media1.turnUpVolume();
        media1.turnUpVolume();

        media2.turnUpBrightness();
        media2.turnUpBrightness();
        media2.turnDownBrightness();
        media2.turnDownBrightness();

        media3.turnDownBrightness();
        media3.turnDownBrightness();

        for (MediaObject currentMedia : mediaList) {
            currentMedia.read();
        }


    }
}

import entities.Audio;
import entities.Image;
import entities.MediaObject;
import entities.Video;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MediaObject media1 = new Audio("Audio", 4);
        MediaObject media2 = new Video("Video", 6, 1);
        MediaObject media3 = new Image("Image", 7);

        MediaObject[] mediaList = {media1, media2, media3};

        for (MediaObject currentMedia : mediaList) {
            currentMedia.read();
        }

    }
}

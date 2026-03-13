import entities.MediaObject;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MediaObject media1 = new MediaObject("Audio");
        MediaObject media2 = new MediaObject("Video");
        MediaObject media3 = new MediaObject("Immagine");

        MediaObject[] mediaList = {media1, media2, media3};

        for (MediaObject currentMedia : mediaList) {
            currentMedia.read();
        }

    }
}

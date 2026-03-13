import entities.*;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Audio media1 = new Audio("Audio", 4);
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
        }*/

        Scanner scanner = new Scanner(System.in);

        MediaObject[] mediaList = new MediaObject[5];

        int i = 0;
        while (i < mediaList.length) {
            System.out.println("Choose the type of media to create (AUDIO, VIDEO, IMAGE):");
            String input = scanner.nextLine().toUpperCase().trim();
            if (input.equals("AUDIO") || input.equals("VIDEO") || input.equals("IMAGE")) {
                MediaType inputType = MediaType.valueOf(input);
                if (inputType == MediaType.AUDIO) {
                    System.out.println("Type the title of the audio:");
                    String title = scanner.nextLine();
                    System.out.println("Type the length of the audio:");
                    int length = Integer.parseInt(scanner.nextLine());
                    mediaList[i] = new Audio(title, length);
                    i++;
                } else if (inputType == MediaType.VIDEO) {
                    System.out.println("Type the title of the video:");
                    String title = scanner.nextLine();
                    System.out.println("Type the length of the video:");
                    int length = Integer.parseInt(scanner.nextLine());
                    mediaList[i] = new Video(title, length);
                    i++;
                } else {
                    System.out.println("Type the title of the image:");
                    String title = scanner.nextLine();
                    mediaList[i] = new Image(title);
                    i++;
                }
            } else {
                System.out.println("Type of media not available");
            }
        }

        System.out.println("Media created successfully: " + Arrays.toString(mediaList));

        while (true) {
            System.out.println("Type which media you would like to play (1 to 5) or quit from the player (0):");
            int mediaNumber = Integer.parseInt(scanner.nextLine());
            if (mediaNumber == 0) {
                break;
            } else if (mediaNumber >= 1 && mediaNumber <= 5) {
                System.out.println("Now playing: " + mediaList[mediaNumber - 1].getTitle());
                mediaList[mediaNumber - 1].read();
            } else {
                System.out.println("Media not available");
            }
        }


    }
}

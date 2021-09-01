package miAGK.zad1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Zapis {

    public static void main(String[] args) throws IOException {

        // Save as JPEG
        File file = new File("myimage.jpg");
        ImageIO.write(Rectangle(128, 512, 0xffffff), "jpg", file);

    }

    public static BufferedImage Rectangle(int width, int height, int color) {

        int[][] arr = new int[width][height];
        for (int i = 0; i < width; i++)
            for (int j = 0; j < height; j++) {
                arr[i][j] = color;
            }

        // Constructs a BufferedImage of one of the predefined image types.
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        for (int i = 0; i < width; i++)
            for (int j = 0; j < height; j++) {
                bufferedImage.setRGB(i, j, arr[i][j]);
            }

        return bufferedImage;
    }

}


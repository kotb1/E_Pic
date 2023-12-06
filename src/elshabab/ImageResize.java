package elshabab;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageResize {

	public static void main(String[] args) {
		File jpgOriginal=new File("C:\\Users\\RS3\\Desktop\\New folder\\img.jpg");
		File jpgResized=new File("C:\\Users\\RS3\\Desktop\\resized.jpg");
		resizeImage(jpgOriginal, jpgResized, 2500, 4500, "jpg");
	}
	
	private static void resizeImage(File originalImage, File resizedImage, int width, int height, String format)
	{
		try {
			BufferedImage original=ImageIO.read(originalImage);
			BufferedImage resized=new BufferedImage(width, height, original.getType());
			Graphics2D g2=resized.createGraphics();
			g2.drawImage(original, 0, 0, width, height, null);
			g2.dispose();
			ImageIO.write(resized, format, resizedImage);
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}

}
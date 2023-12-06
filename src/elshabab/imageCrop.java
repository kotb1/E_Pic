package elshabab;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class imageCrop {

	public static void main(String[] args) {
		try
		{
			BufferedImage originalImage=ImageIO.read(new File("C:\\Users\\RS3\\Desktop\\New folder\\img.jpg"));
			System.out.println("Original Image Dimension: "+originalImage.getWidth()+"x"+originalImage.getHeight());
			
			
			BufferedImage croppedImage=originalImage.getSubimage(0, 0, 200, 100);
			System.out.println("Cropped Image Dimension: "+croppedImage.getWidth()+"x"+croppedImage.getHeight());
			
			File outputFile=new File("C:\\Users\\RS3\\Desktop\\img3.jpg");
			ImageIO.write(croppedImage, "jpg", outputFile);
			System.out.println("Image cropped successfully: "+outputFile.getPath());
			
		}
		catch(IOException ex){
			ex.printStackTrace();
		}

	}

}
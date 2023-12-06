import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Crop {
	public Crop(String s,int num1,int num2,int num3,int num4) {
		try 
		{
		BufferedImage originalImage=ImageIO.read(new File(s));		
		BufferedImage croppedImage=originalImage.getSubimage(num1,num2, num3, num4);
		File outputFile=new File("C:\\Users\\RS3\\Desktop\\img3.jpg");
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}

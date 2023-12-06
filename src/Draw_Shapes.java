import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Draw_Shapes {
	String q;
	String s;
	int num1;
	int num2;
	int num3;
	int num4;
	public  Draw_Shapes(String r,String d,int nums1,int nums2,int nums3,int nums4) 
	{
		try 
		{
			q=r;
			s=d;
			num1=nums1;
			num2=nums2;
			num3=nums3;
			num4=nums4;
			File f = new File(q);
			final BufferedImage img = ImageIO.read(f);
			Graphics g2d = img.createGraphics();
			g2d.setColor(Color.BLACK);
			if(s.equals("R")) 
			{
			g2d.drawRect(num1, num2, num3, num4);
			}
			else if(s.contentEquals("O")) {
			g2d.drawOval(num1, num2, num3, num4);
			}
			g2d.dispose();
			ImageIO.write(img, "png", new File("C:\\Users\\RS3\\Desktop\\newwwwwpp.png"));
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}

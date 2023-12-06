import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class insert_text {
	public  static void insert_text(String q, String s,int num1,int num2) 
	{
		try {
		File f = new File(q);
	    final BufferedImage image = ImageIO.read(f);

	    Graphics g = image.getGraphics();
	    g.setFont(g.getFont().deriveFont(30f));
	    g.drawString(s, num1, num2);
	    g.dispose();

	    ImageIO.write(image, "png", new File("C:\\Users\\RS3\\Desktop\\newwwpp.png"));
	    }
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}

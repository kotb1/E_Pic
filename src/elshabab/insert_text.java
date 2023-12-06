package elshabab;

import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.imageio.ImageIO;




public class insert_text {
	public static void main(String[] args) throws Exception {
		File f = new File("C:\\Users\\RS3\\Desktop\\New folder\\img.jpg");
	    final BufferedImage image = ImageIO.read(f);

	    Graphics g = image.getGraphics();
	    g.setFont(g.getFont().deriveFont(30f));
	    g.drawString("Hello World!", 100, 100);
	    g.dispose();

	    ImageIO.write(image, "png", new File("C:\\Users\\RS3\\Desktop\\newwwpp.png"));
	}
}
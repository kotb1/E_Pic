package elshabab;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.imageio.ImageIO;




public class insert_shapes  {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\RS3\\Desktop\\New folder\\img.jpg");
		final BufferedImage img = ImageIO.read(f);
		Graphics g2d = img.createGraphics();
		g2d.setColor(Color.BLACK);
		g2d.drawRect(50, 50, 100, 100);
		g2d.drawOval(10, 10, 300, 300);
		g2d.dispose();
		ImageIO.write(img, "png", new File("C:\\Users\\RS3\\Desktop\\newwwwwpp.png"));
	}
}
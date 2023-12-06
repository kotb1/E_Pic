package elshabab;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
public class loadimage {
	public static void main(String args[])	throws IOException{
		JFrame w =new JFrame("test!");
		w.setLocation(100,100);
		w.setSize(600,500);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		File f = new File("C:\\Users\\RS3\\Desktop\\New folder\\img.jpg");
		BufferedImage image = ImageIO.read(f);
		
		
		JPanel p =new JPanel() {
			protected void paintComponent(Graphics g) {
				g.drawImage(image, 0,0 , 400, 400, null);
				g.drawString(this.getBounds().toString(),5,15);
			}
		};
		w.add(p);
		w.setVisible(true);
	}
}
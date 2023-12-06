package elshabab;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
public class ChangeImageSize 
{
	public static void main(String[] args) throws IOException
	{
		ImageIcon dabIcon =new ImageIcon("C:\\Users\\RS3\\Desktop\\New folder\\img.jpg");
		Image dabImage = dabIcon.getImage();
		Image modifiedDabImage = dabImage.getScaledInstance(500,500,java.awt.Image.SCALE_SMOOTH);
		dabIcon= new ImageIcon(modifiedDabImage);
		JButton crop1 = new JButton("Change Colors");
		JOptionPane.showMessageDialog(null,null, null, JOptionPane.INFORMATION_MESSAGE, crop1);
		/*ImageInputStream iis=ImageIO.createImageInputStream(dabIcon);
		Iterator<ImageReader> iterator=ImageIO.getImageReaders(iis);
		ImageReader reader=iterator.next();
		String format=reader.getFormatName();
		Image img = dabIcon.getImage();
		BufferedImage buff = (BufferedImage) img;
		File output=new File("C:\\Users\\RS3\\Desktop\\rotated180.png");
		ImageIO.write(buff,format, output);*/
	}
}
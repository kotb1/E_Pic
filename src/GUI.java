import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class GUI 
{
	public static void main(String[] args) throws IOException 
	{
		e pic = new e();
	}
}
class e extends JFrame implements ActionListener
{		
	
	
	
	JTextField t1 = new JTextField(50);
	JTextField t2 = new JTextField(50);
	JTextField t3 = new JTextField(50);
	JTextField t4 = new JTextField(50);
	JTextField t5 = new JTextField(50);
	JTextField t6 = new JTextField(50);
	JTextField t7 = new JTextField(50);
	JTextField t8 = new JTextField(50);
	JTextField t9 = new JTextField(50);
	JTextField t10 = new JTextField(50);
	JTextField t11 = new JTextField(50);
	JTextField t12 = new JTextField(50);
	JTextField t13 = new JTextField(50);
	JTextField t14 = new JTextField(50);
	JTextField t15 = new JTextField(50);
	JTextField t16 = new JTextField(50);
	JTextField t17 = new JTextField(50);
	JTextField t18 = new JTextField(50);
	JTextField t19 = new JTextField(50);
	JTextField t20 = new JTextField(50);
	JTextField t21 = new JTextField(50);
	JTextField t22 = new JTextField(50);
	JTextField t23 = new JTextField(50);
	JTextField t24 = new JTextField(50);
	
	
	JButton c1 = new JButton("Load Image");;
	JButton crop1 = new JButton("Change Color");
	JButton crop2 = new JButton("Draw Shapes");
	JButton crop3 = new JButton("Insert Text");
	JButton crop4 = new JButton("Crop");
	JButton crop5 = new JButton("Resize");
	JButton crop6 = new JButton("Rotate");
	JButton c2 = new JButton("Enter");
	JButton c3 = new JButton("Enter");
	JButton c4 = new JButton("Enter");
	JButton c5 = new JButton("Enter");
	JButton c6 = new JButton("Enter");
	JButton c7 = new JButton("Enter");
	JButton c8 = new JButton("Enter");
	
	public e() throws IOException 
	{
		JLabel l = new JLabel("E-PIC");
		add(l);
		add(crop1);
		add(crop2);
		add(crop3);
		add(crop4);
		add(crop5);
		add(crop6);
		add(c1);
		c1.addActionListener(this);
		crop6.addActionListener(this);
		crop4.addActionListener(this);
		crop5.addActionListener(this);
		c2.addActionListener(this);
		c3.addActionListener(this);
		c4.addActionListener(this);
		crop3.addActionListener(this);
		c5.addActionListener(this);
		crop2.addActionListener(this);
		c6.addActionListener(this);
		c7.addActionListener(this);
		crop1.addActionListener(this);
		c8.addActionListener(this);
		setVisible(true);
		setSize(100,500);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource()==c1) 
		{
			add(t1);
			t1.setText("Path");
			add(c2);
		}
		if(ae.getSource()==c2) 
		{
			//Load_image b1 =new Load_image(t1.getText());
			//b1.Load(t1.getText());
			ImageIcon dabIcon =new ImageIcon(t1.getText());
			JOptionPane.showMessageDialog(null,null, "Display Image", JOptionPane.INFORMATION_MESSAGE, dabIcon);
			c2.setVisible(false);
			t1.setVisible(false);
		}
		if(ae.getSource()==c3) 
		{
			try
			{
				
				int num1= Integer.parseInt(t3.getText());
				int num2= Integer.parseInt(t4.getText());
				int num3= Integer.parseInt(t5.getText());
				int num4= Integer.parseInt(t6.getText());
				BufferedImage originalImage=ImageIO.read(new File(t2.getText()));		
				BufferedImage croppedImage=originalImage.getSubimage(num1,num2, num3, num4);
				File outputFile=new File("C:\\Users\\RS3\\Desktop\\img3.jpg");
				ImageIO.write(croppedImage, "jpg", outputFile);
				ImageIcon dabIcon =new ImageIcon("C:\\Users\\RS3\\Desktop\\img3.jpg");
				JOptionPane.showMessageDialog(null,null, "Display Image", JOptionPane.INFORMATION_MESSAGE, dabIcon);
				t2.setVisible(false);
				t3.setVisible(false);
				t4.setVisible(false);
				t5.setVisible(false);
				t6.setVisible(false);
				c3.setVisible(false);
			}
			catch(IOException ex)
			{
				ex.printStackTrace();
			}
		}
		if(ae.getSource()==crop6) 
		{
			add(t20);
			t20.setText("Please Enter the Path of image");
			add(t21);
			t21.setText("Please Enter 180 Or 90");
			add(t22);
			t22.setText("If 90 Write 'Right' OR 'Left'");
			add(c7);
		}
		if(ae.getSource()==c7) 
		{
			File input=new File(t20.getText());
			File output=new File("C:\\Users\\RS3\\Desktop\\rotated180.png");
			String s=t21.getText();
			String p=t22.getText();
			t20.setVisible(false);
			t21.setVisible(false);
			t22.setVisible(false);
			c7.setVisible(false);
			if(s.equals("180"))
			{
				Rotate.rotate180(input, output);
			}
			else if(s.equals("90")) 
			{
				if(p.equals("Right")) 
				{
					Rotate.rotate90(input, output, Rotate.ROTATE_RIGHT);
				}
				else if(p.equals("Left")) 
				{
					Rotate.rotate90(input, output, Rotate.ROTATE_LEFT);
				}
			}
			ImageIcon dabIcon =new ImageIcon("C:\\Users\\RS3\\Desktop\\rotated180.png");
			JOptionPane.showMessageDialog(null,null, "Display Image", JOptionPane.INFORMATION_MESSAGE, dabIcon);
		}
		if(ae.getSource()==crop4) 
		{
			add(t2);
			t2.setText("Please Enter the Path of image");
			add(t3);
			t3.setText("Please Enter X Dimension");
			add(t4);
			t4.setText("Please Enter Y Dimension");
			add(t5);
			t5.setText("Please Enter Length");
			add(t6);
			t6.setText("Please Enter Width");
			add(c3);
		}
		if(ae.getSource()==crop5) 
		{			
			add(t7);
			t7.setText("Please Enter the Path of image");
			add(t8);
			t8.setText("Please Enter New Length");
			add(t9);
			t9.setText("Please Enter New Width");
			add(c4);
		}
		if(ae.getSource()==c4) 
		{
			int num1= Integer.parseInt(t8.getText());
			int num2= Integer.parseInt(t9.getText());
			File jpgOriginal=new File(t7.getText());
			Resize b1 = new Resize();
			File jpgResized=new File("C:\\Users\\RS3\\Desktop\\resized.jpg");
			b1.resizeImage(jpgOriginal, jpgResized, num1, num2, "jpg");
			ImageIcon dabIcon =new ImageIcon("C:\\Users\\RS3\\Desktop\\resized.jpg");
			JOptionPane.showMessageDialog(null,null, "Display Image", JOptionPane.INFORMATION_MESSAGE, dabIcon);
			t7.setVisible(false);
			t8.setVisible(false);
			t9.setVisible(false);
			c4.setVisible(false);
		}
		if(ae.getSource()==crop3) 
		{
			add(t10);
			t10.setText("Please Enter the Path of image");
			add(t11);
			t11.setText("Please Enter Ur Text");
			add(t12);
			t12.setText("Please Enter X Dimension");
			add(t13);
			t13.setText("Please Enter Y Dimension");
			add(c5);
		}
		if(ae.getSource()==c5) 
		{
			String s = t10.getText();
			String p = t11.getText();
			int num1= Integer.parseInt(t12.getText());
			int num2= Integer.parseInt(t13.getText());
			insert_text b1 = new insert_text();
			b1.insert_text(s,p,num1,num2);
			ImageIcon dabIcon =new ImageIcon("C:\\Users\\RS3\\Desktop\\newwwpp.png");
			JOptionPane.showMessageDialog(null,null, "Display Image", JOptionPane.INFORMATION_MESSAGE, dabIcon);
			t10.setVisible(false);
			t11.setVisible(false);
			t12.setVisible(false);
			t13.setVisible(false);
			c5.setVisible(false);
		}
		if(ae.getSource()==crop2) 
		{
			add(t14);
			t14.setText("Please Enter the Path of image");
			add(t15);
			t15.setText("Please Enter 'R' to insert a Rectangle OR 'O' to insert an Oval ");
			add(t16);
			t16.setText("Please Enter X Dimension");
			add(t17);
			t17.setText("Please Enter Y Dimension");
			add(t18);
			t18.setText("Please Enter Length of Shape");
			add(t19);
			t19.setText("Please Enter Width of Shape");
			add(c6);
		} 
		if(ae.getSource()==c6) 
		{
			String s = t14.getText();
			String p = t15.getText();
			int num1= Integer.parseInt(t16.getText());
			int num2= Integer.parseInt(t17.getText());
			int num3= Integer.parseInt(t18.getText());
			int num4= Integer.parseInt(t19.getText());
			Draw_Shapes b1 = new Draw_Shapes(s,p,num1,num2,num3,num4);			
			ImageIcon dabIcon =new ImageIcon("C:\\Users\\RS3\\Desktop\\newwwwwpp.png");
			JOptionPane.showMessageDialog(null,null, "Display Image", JOptionPane.INFORMATION_MESSAGE, dabIcon);
			t14.setVisible(false);
			t15.setVisible(false);
			t16.setVisible(false);
			t17.setVisible(false);
			t18.setVisible(false);
			t19.setVisible(false);
			c6.setVisible(false);
			
		}
		if(ae.getSource()==crop1) 
		{
			add(t23);
			t23.setText("Please Enter the Path of image");
			add(t24);
			t24.setText("Please Enter 'Blue' OR'Green 'OR 'Red'");
			add(c8);
		}
		if(ae.getSource()==c8) 
		{
			Change_Colors b1 = new Change_Colors(t23.getText(),t24.getText());
			ImageIcon dabIcon =new ImageIcon("C:\\Users\\RS3\\Desktop\\newnew.png");
			JOptionPane.showMessageDialog(null,null, "Display Image", JOptionPane.INFORMATION_MESSAGE, dabIcon);
			t23.setVisible(false);
			t24.setVisible(false);
			c8.setVisible(false);
		}
		
		
		
		
		
		
		/*File input=new File("C:\\Users\\RS3\\Desktop\\New folder\\img.jpg");
		File output=new File("C:\\Users\\RS3\\Desktop\\rotated180.png");
		imageRotate.rotate90(input, output, imageRotate.ROTATE_LEFT);
		ImageIcon dabIcon =new ImageIcon("C:\\Users\\RS3\\Desktop\\rotated180.png");
		JOptionPane.showMessageDialog(null,null, "Display Image", JOptionPane.INFORMATION_MESSAGE, dabIcon);*/
	}
}


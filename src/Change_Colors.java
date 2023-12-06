import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Change_Colors {
	public Change_Colors(String s,String c) {
		BufferedImage img = null; 
		File f = null; 

		// read image 
		try
		{ 
			f = new File(s); 
			img = ImageIO.read(f); 
		} 
		catch(IOException e) 
		{ 
			System.out.println(e); 
		} 

		// get width and height 
		int width = img.getWidth(); 
		int height = img.getHeight(); 
		
		if(c.equals("Red")) {
			// convert to red image 
			for (int y = 0; y < height; y++) 
			{ 
				for (int x = 0; x < width; x++) 
				{ 
					int p = img.getRGB(x,y); 

					int a = (p>>24)&0xff; 
					int r = (p>>16)&0xff; 

					// set new RGB 
					// keeping the r value same as in original 
					// image and setting g and b as 0. 
					p = (a<<24) | (r<<16) | (0<<8) | 0; 

					img.setRGB(x, y, p); 
				} 
			}
		}
		else if(c.equals("Green")) 
		{
			// convert to green image 
	        for (int y = 0; y < height; y++) 
	        { 
	            for (int x = 0; x < width; x++) 
	            { 
	                int p = img.getRGB(x,y); 
	  
	                int a = (p>>24)&0xff; 
	                int g = (p>>8)&0xff; 
	  
	                // set new RGB 
	                // keeping the g value same as in original 
	                // image and setting r and b as 0. 
	                p = (a<<24) | (0<<16) | (g<<8) | 0; 
	  
	                img.setRGB(x, y, p); 
	            } 
	        }
		}
		else if(c.equals("Blue")) 
		{
			// convert to blue image 
	        for (int y = 0; y < height; y++) 
	        { 
	            for (int x = 0; x < width; x++) 
	            { 
	                int p = img.getRGB(x,y); 
	  
	                int a = (p>>24)&0xff; 
	                int b = p&0xff; 
	  
	                // set new RGB 
	                // keeping the b value same as in original 
	                // image and setting r and g as 0. 
	                p = (a<<24) | (0<<16) | (0<<8) | b; 
	  
	                img.setRGB(x, y, p); 
	            } 
	        }
		}
		

		// write image 
		try
		{ 
			f = new File("C:\\Users\\RS3\\Desktop\\newnew.png"); 
			ImageIO.write(img, "jpg", f); 
		} 
		catch(IOException e) 
		{ 
			System.out.println(e); 
		}
	}

}

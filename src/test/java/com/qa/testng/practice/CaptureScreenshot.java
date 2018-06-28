package com.qa.testng.practice;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
 
import javax.imageio.ImageIO;
 
public class CaptureScreenshot {
 
	public static void main(String[] args) throws Exception
	{
 
// This code will capture screenshot of current screen		
BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
	    
// This will store screenshot on Specific location
ImageIO.write(image, "png", new File("Screenshot\\CurrentScreenshot.png")); 
 
	}
 
}
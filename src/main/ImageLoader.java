package main;

import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageLoader {
	
	public static BufferedImage loadImage(String path){
		try {
			//return ImageIO.read(ImageLoader.class.getResource(path));
			return ImageIO.read(new FileInputStream(path));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
		return null;
		
	}
	/*public static Clip LoadSound(String direction){
		try{
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(ImageLoader.class.getResource(direction)));
			return clip;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}*/
}

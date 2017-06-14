package test;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Util {
	public static BufferedImage getImg(String path){
		BufferedImage img;
		try {
			img=ImageIO.read(Util.class.getResource(path));
			return img;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}

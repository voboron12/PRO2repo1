package image;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageSourceFile extends ImageSource{
	private static final String PATH = "image/";

	
	
	@Override
	public void fillMap() {
		getMap().put(Image.BACKGROUND.getKey(),"background.png");
		//TODO
	}
	
	@Override
	public BufferedImage getImage() throws IOException {
		return ImageIO.read(new File(PATH + getSource()));
	}
}

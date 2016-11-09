package image;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public abstract class ImageSource {
	
	private String source;
	private Map<String, String> map;
	
	public Map<String, String> getMap() {
		return map;
	}

	public abstract void fillMap();
	
	public abstract BufferedImage getImage() throws IOException;
	
	public ImageSource(){
		map = new HashMap<>();
	}

	public String getSource() {
		return source;
	}

	public void setSource(String key) {
		this.source = map.get(key);
	}
	
}

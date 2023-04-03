package image;

import java.io.InputStream;

public abstract class Image {

	private int imageCode;
	private String imageName;
	private InputStream imageStream;
	
	public int getImageCode() {
		return imageCode;
	}
	public void setImageCode(int imageCode) {
		if(imageCode>=1) {
		   this.imageCode = imageCode;
		}
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		if(imageName!=null) {
		   if((imageName.length()>=1)&&(imageName.length()<=100)) {
                this.imageName = imageName;
		   }
		}
	}
	public InputStream getImageStream() {
		return imageStream;
	}
	public void setImageStream(InputStream imageStream) {
		if(imageStream!=null) {
		   this.imageStream = imageStream;
		}
	}
	
	public abstract String getType();
	
}

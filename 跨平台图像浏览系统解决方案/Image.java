package 跨平台图像浏览系统解决方案;

abstract class Image {
protected ImageImp imp;
public void setImageImp(ImageImp imp) {
	this.imp = imp;
}
public abstract void parseFile(String fileName);
}

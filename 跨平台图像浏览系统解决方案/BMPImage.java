package 跨平台图像浏览系统解决方案;

class BMPImage extends Image{
	public void parseFile(String fileName) {
		Matrix m = new Matrix();
		imp.doPaint(m);;
		System.out.println(fileName + ",格式为BMP.");
	}
}

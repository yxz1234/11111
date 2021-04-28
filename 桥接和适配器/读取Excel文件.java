package 桥接和适配器;

public class 读取Excel文件 extends ExcelAPI implements 数据采集{
	public void read(String c) {
		System.out.println("读取"+c);
		super.contact();
	}

}

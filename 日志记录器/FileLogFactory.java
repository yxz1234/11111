package 日志记录器;

class FileLogFactory implements LogFactory {
public Log createLog() {
	Log  log = new FileLog();
	System.out.println("文件生成文件日志记录");
	return new FileLog();
}
}

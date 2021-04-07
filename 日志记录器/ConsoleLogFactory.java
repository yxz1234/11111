package 日志记录器;

class ConsoleLogFactory implements LogFactory{
public Log createLog() {
	Log log = new ConsoleLog();
	System.out.println("控制台生成控制台日志记录");
	return new ConsoleLog();
}
}

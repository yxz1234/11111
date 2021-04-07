package 日志记录器;

class DatabaseLogFactoty implements LogFactory{
public Log createLog() {
	Log log = new DatabaseLog();
	System.out.println("数据库生成数据库日志记录器");
	return new DatabaseLog();
}
}

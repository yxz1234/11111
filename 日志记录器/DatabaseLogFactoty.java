package ��־��¼��;

class DatabaseLogFactoty implements LogFactory{
public Log createLog() {
	Log log = new DatabaseLog();
	System.out.println("���ݿ��������ݿ���־��¼��");
	return new DatabaseLog();
}
}

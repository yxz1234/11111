package ��־��¼��;

class FileLogFactory implements LogFactory {
public Log createLog() {
	Log  log = new FileLog();
	System.out.println("�ļ������ļ���־��¼");
	return new FileLog();
}
}

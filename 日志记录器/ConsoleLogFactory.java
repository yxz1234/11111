package ��־��¼��;

class ConsoleLogFactory implements LogFactory{
public Log createLog() {
	Log log = new ConsoleLog();
	System.out.println("����̨���ɿ���̨��־��¼");
	return new ConsoleLog();
}
}

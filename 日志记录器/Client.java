package ��־��¼��;

public class Client {
public static void main(String args[]){
	try {
	LogFactory factory;
	Log log;
	factory = (LogFactory)XMLUtil.getBean();
	log = factory.createLog();
	log.writeLog();
}
catch(Exception e) 
{
	System.out.println(e.getMessage());
}
}
}


package ����ģʽ;

public class Client {
	public static void main(String[] args) {
        Context context;
        System.out.println("-----ִ�в��ԣ�-----");
        context = new Context(new ConcreateStrategy1());
        context.execute();
        
        System.out.println("-----ִ�в���2-----");
        context = new Context(new ConcreateStrategy2());
        context.execute();
    }

}

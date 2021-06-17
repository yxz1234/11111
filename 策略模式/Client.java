package 策略模式;

public class Client {
	public static void main(String[] args) {
        Context context;
        System.out.println("-----执行策略！-----");
        context = new Context(new ConcreateStrategy1());
        context.execute();
        
        System.out.println("-----执行策略2-----");
        context = new Context(new ConcreateStrategy2());
        context.execute();
    }

}

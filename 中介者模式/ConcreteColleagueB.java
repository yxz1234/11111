package �н���ģʽ;

public class ConcreteColleagueB extends Colleague{
	public ConcreteColleagueB(Mediator mediator) {
		super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void notify(String message) {
        System.out.println("ͬ��2�õ���Ϣ:" + message);
    }
}

package �н���ģʽ;

public class ConcreteColleagueA extends Colleague{
	public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void notify(String message) {
        System.out.println("ͬ��1�õ���Ϣ:" + message);
    }

}

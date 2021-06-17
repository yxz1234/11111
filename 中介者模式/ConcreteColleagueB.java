package 中介者模式;

public class ConcreteColleagueB extends Colleague{
	public ConcreteColleagueB(Mediator mediator) {
		super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void notify(String message) {
        System.out.println("同事2得到消息:" + message);
    }
}

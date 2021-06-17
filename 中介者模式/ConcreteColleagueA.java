package 中介者模式;

public class ConcreteColleagueA extends Colleague{
	public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void notify(String message) {
        System.out.println("同事1得到消息:" + message);
    }

}

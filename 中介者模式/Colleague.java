package 中介者模式;

abstract class Colleague {
	protected Mediator mediator;
	public Colleague(Mediator mediator){
        this.mediator=mediator;
    }
	abstract void send(String message);
	abstract void notify(String message);
}

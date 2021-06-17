package �н���ģʽ;

abstract class Colleague {
	protected Mediator mediator;
	public Colleague(Mediator mediator){
        this.mediator=mediator;
    }
	abstract void send(String message);
	abstract void notify(String message);
}

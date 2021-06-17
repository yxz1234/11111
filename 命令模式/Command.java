package ÃüÁîÄ£Ê½;

public class Command extends Icommand{

	public Command(Cook cook) {
		super(cook);
	}

	
	public void Excute() {
		cook.make();
		
	}
}

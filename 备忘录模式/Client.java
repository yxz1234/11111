package 备忘录模式;

public class Client {
	public static void main(String[] args) {
		 Role role = new Role(100, 100);
	        System.out.println("----------大战BOSS之前----------");
	        role.display();
	        
	        Caretaker caretaker = new Caretaker();
	        caretaker.memento = role.saveMemento();
	       
	        role.setBloodFlow(20);
	        role.setMagicPoint(20);
	        System.out.println("----------大战BOSS----------");
	        role.display();
	        
	        role.restoreMemento(caretaker.getMemento());
	        System.out.println("----------恢复----------");
	        role.display();
	        
	    }

}

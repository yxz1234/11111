package ����¼ģʽ;

public class Client {
	public static void main(String[] args) {
		 Role role = new Role(100, 100);
	        System.out.println("----------��սBOSS֮ǰ----------");
	        role.display();
	        
	        Caretaker caretaker = new Caretaker();
	        caretaker.memento = role.saveMemento();
	       
	        role.setBloodFlow(20);
	        role.setMagicPoint(20);
	        System.out.println("----------��սBOSS----------");
	        role.display();
	        
	        role.restoreMemento(caretaker.getMemento());
	        System.out.println("----------�ָ�----------");
	        role.display();
	        
	    }

}

package 观察者模式;

public interface Subject {
	 public void attach(Observer observer);
	    
	    public void detach(Observer observer);
	  
	    public void notify(String message);
	
}

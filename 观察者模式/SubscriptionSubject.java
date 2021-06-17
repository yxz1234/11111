package 观察者模式;

import java.util.ArrayList;
import java.util.List;

public class SubscriptionSubject implements Subject{
	 private List<Observer> weixinUserlist = new ArrayList<Observer>();

public void attach(Observer observer) {
    weixinUserlist.add(observer);
}

@Override
public void detach(Observer observer) {
    weixinUserlist.remove(observer);
}

@Override
public void notify(String message) {
    for (Observer observer : weixinUserlist) {
        observer.update(message);
    }
}
}
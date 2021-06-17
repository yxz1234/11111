package 观察者模式;

public class Client {
	public static void main(String[] args) {
        SubscriptionSubject mSubscriptionSubject=new SubscriptionSubject();
       
        WeixinUser user1=new WeixinUser("张三");
        WeixinUser user2=new WeixinUser("李四");
        WeixinUser user3=new WeixinUser("王五");
        
        mSubscriptionSubject.attach(user1);
        mSubscriptionSubject.attach(user2);
        mSubscriptionSubject.attach(user3);
        
        mSubscriptionSubject.notify("CSGO的专栏更新了");
    }

}

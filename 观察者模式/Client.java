package �۲���ģʽ;

public class Client {
	public static void main(String[] args) {
        SubscriptionSubject mSubscriptionSubject=new SubscriptionSubject();
       
        WeixinUser user1=new WeixinUser("����");
        WeixinUser user2=new WeixinUser("����");
        WeixinUser user3=new WeixinUser("����");
        
        mSubscriptionSubject.attach(user1);
        mSubscriptionSubject.attach(user2);
        mSubscriptionSubject.attach(user3);
        
        mSubscriptionSubject.notify("CSGO��ר��������");
    }

}

package �н���ģʽ;

public class Client {
	public static void main(String[] args) {
        ConcreteMediator concreteMediator=new ConcreteMediator();
        ConcreteColleagueA concreteColleagueA=new ConcreteColleagueA(concreteMediator);
        ConcreteColleagueB concreteColleagueB=new ConcreteColleagueB(concreteMediator);
        concreteMediator.setConcreteColleagueA(concreteColleagueA);
        concreteMediator.setConcreteColleagueB(concreteColleagueB);
        concreteColleagueA.send("���ڸ�ʲô��");
        concreteColleagueB.send("�Ҳ�������㣡");
    }
}

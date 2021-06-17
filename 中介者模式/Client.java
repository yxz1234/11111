package 中介者模式;

public class Client {
	public static void main(String[] args) {
        ConcreteMediator concreteMediator=new ConcreteMediator();
        ConcreteColleagueA concreteColleagueA=new ConcreteColleagueA(concreteMediator);
        ConcreteColleagueB concreteColleagueB=new ConcreteColleagueB(concreteMediator);
        concreteMediator.setConcreteColleagueA(concreteColleagueA);
        concreteMediator.setConcreteColleagueB(concreteColleagueB);
        concreteColleagueA.send("你在干什么？");
        concreteColleagueB.send("我不想告诉你！");
    }
}

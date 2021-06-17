package 中介者模式;

public class ConcreteMediator implements Mediator{
	private ConcreteColleagueA concreteColleagueA;
    private ConcreteColleagueB concreteColleagueB;
    public void setConcreteColleagueA(ConcreteColleagueA concreteColleagueA) {
        this.concreteColleagueA = concreteColleagueA;
    }

    public void setConcreteColleagueB(ConcreteColleagueB concreteColleagueB) {
        this.concreteColleagueB = concreteColleagueB;
    }

    public void send(String message, Colleague colleague) {
        if (colleague == concreteColleagueA) {
            concreteColleagueB.notify(message);
        } else {
            concreteColleagueA.notify(message);
        }
    }
}

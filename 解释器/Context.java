package ������;

public class Context {
	private String[] citys = { "�Ϻ�", "����", "����", "����" };
	private String[] persons = { "����", "С��", "�м���", "�и�" };
	private Expression expression = null;
 
	public Context() {
		Expression city = new TerminalExpression(citys);
		Expression person = new TerminalExpression(persons);
		expression = new AndExpression(city, person);
	}
 
	//������ر��ʽ��Ľ��ͷ���
	public void freeRide(String info) {
		boolean ok = expression.interpret(info);
		if (ok)
			System.out.println("����" + info + "�������γ˳���ѣ�");
		else
			System.out.println(info + "�������������Ա�����γ˳��۷�2Ԫ��");
	}
}


package ����ģʽ;

public class Client {
		public static void main(String[] args) {
			Waiter waiter=new Waiter();   //��ӷ���Ա
			Cook cook=new Cook();  //��ӳ�ʦ
			Command command=new Command(cook);  //��Ӳ˵�����Ӧ��ʦ
			waiter.setList(command);   //���
			waiter.Notify();   //ִ�в���

		}

	}



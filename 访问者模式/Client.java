package ������ģʽ;

public class Client {
	public static void main(String[] args) {
        AccountBook accountBook = new AccountBook();
        //�����������
        accountBook.addBill(new IncomeBill(10000, "����Ʒ"));
        accountBook.addBill(new IncomeBill(12000, "�����λ"));
        //�������֧��
        accountBook.addBill(new ConsumeBill(1000, "����"));
        accountBook.addBill(new ConsumeBill(2000, "���Ϸ�"));
 
        AccountBookViewer boss = new Boss();
        AccountBookViewer cpa = new CPA();
 
        //���������߷ֱ�����˱�
        accountBook.show(cpa);
        accountBook.show(boss);
 
        ((Boss) boss).getTotalConsume();
        ((Boss) boss).getTotalIncome();
    }

}

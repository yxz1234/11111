package ������ģʽ;

public class Boss implements AccountBookViewer{
	 private double totalIncome;
	 
	    private double totalConsume;
	 
	    public void view(ConsumeBill bill) {
	        totalConsume += bill.getAmount();
	    }
	 
	    public void view(IncomeBill bill) {
	        totalIncome += bill.getAmount();
	    }
	 
	    public double getTotalIncome() {
	        System.out.println("�ϰ�鿴һ��������٣���Ŀ�ǣ�" + totalIncome);
	        return totalIncome;
	    }
	 
	    public double getTotalConsume() {
	        System.out.println("�ϰ�鿴һ�����Ѷ��٣���Ŀ�ǣ�" + totalConsume);
	        return totalConsume;
	    }

}

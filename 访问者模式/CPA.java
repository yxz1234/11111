package ������ģʽ;

public class CPA implements AccountBookViewer{
	 public void view(ConsumeBill bill) {
	        if (bill.getItem().equals("����")) {
	            System.out.println("ע��鿴�����Ƿ񽻸�������˰��");
	        }
	    }
	 public void view(IncomeBill bill) {
	        System.out.println("ע��鿴���뽻˰��û��");
	    }

}

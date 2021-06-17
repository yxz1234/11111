package 访问者模式;

public class CPA implements AccountBookViewer{
	 public void view(ConsumeBill bill) {
	        if (bill.getItem().equals("工资")) {
	            System.out.println("注会查看工资是否交个人所得税。");
	        }
	    }
	 public void view(IncomeBill bill) {
	        System.out.println("注会查看收入交税了没。");
	    }

}

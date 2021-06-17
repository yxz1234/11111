package 职责链模式;
public class Client {

	public static void main(String[] args) {
			Handler h1 = new GeneralManager();
			Handler h2 = new DeptManager();
			Handler h3 = new ProjectManager();
			h3.setSuccessor(h2);
			h2.setSuccessor(h1);
	 
			
			String ret1 = h3.handleFeeRequest("小李", 300);
			System.out.println("the ret1 = " + ret1);
			String ret2 = h3.handleFeeRequest("小张", 300);
			System.out.println("the ret2 = " + ret2);
			System.out.println("---------------------------------------");
	 
			String ret3 = h3.handleFeeRequest("小李", 700);
			System.out.println("the ret3 = " + ret3);
			String ret4 = h3.handleFeeRequest("小张", 700);
			System.out.println("the ret4 = " + ret4);
			System.out.println("---------------------------------------");
	 
			String ret5 = h3.handleFeeRequest("小李", 1500);
			System.out.println("the ret5 = " + ret5);
			String ret6 = h3.handleFeeRequest("小张", 1500);
			System.out.println("the ret6 = " + ret6);
		}


}

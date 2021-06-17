package 职责链模式;

public class DeptManager extends Handler{

	public String handleFeeRequest(String user, double fee) {
		String str = "";
		if (fee < 1000) {
			if ("小李".equals(user)) {
				str = "部门经理同意" + user + "聚餐费用" + fee + "元的请求...";
			} 
			else {
				str = "部门经理不同意" + user + "聚餐费用" + fee + "元的请求...";
				
			}
		}
		else {
			if (this.successor != null) {
				return successor.handleFeeRequest(user, fee);
			}
		}
		return str;

		}
}

package 职责链模式;

public class ProjectManager extends Handler {
	public String handleFeeRequest(String user,double fee) {
		String str="";
		if(fee<500){
			if("小李".equals(user)){
				str="项目经理同意"+user+"聚餐费用"+fee+"元的请求...";
			}
			else{
				str="项目经理不同意"+user+"聚餐费用"+fee+"元的请求...";
			}
		}
		else{
			if(this.successor!=null){
				return successor.handleFeeRequest(user, fee);
			}
		}
		return str;

		}

}

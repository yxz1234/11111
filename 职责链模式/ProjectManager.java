package ְ����ģʽ;

public class ProjectManager extends Handler {
	public String handleFeeRequest(String user,double fee) {
		String str="";
		if(fee<500){
			if("С��".equals(user)){
				str="��Ŀ����ͬ��"+user+"�۲ͷ���"+fee+"Ԫ������...";
			}
			else{
				str="��Ŀ����ͬ��"+user+"�۲ͷ���"+fee+"Ԫ������...";
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

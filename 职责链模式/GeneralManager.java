package ְ����ģʽ;

public class GeneralManager extends Handler{
	public String handleFeeRequest(String user,double fee) {
		String str="";
		if(fee>=1000){
			if("С��".equals(user)){
				str="�ܾ���ͬ��"+user+"�۲ͷ���"+fee+"Ԫ������...";
			}
			else{

				str="�ܾ���ͬ��"+user+"�۲ͷ���"+fee+"Ԫ������...";
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

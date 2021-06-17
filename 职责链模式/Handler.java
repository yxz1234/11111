package 职责链模式;

public abstract class Handler {

	 protected Handler successor = null;

	 public void setSuccessor(Handler successor) {
			this.successor = successor;
	 }
			public abstract String handleFeeRequest(String user,double fee);
}


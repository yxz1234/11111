package 访问者模式;

public interface AccountBookViewer {
	void view(ConsumeBill bill);
	void view(IncomeBill bill);
}

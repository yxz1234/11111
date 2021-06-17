package ÃüÁîÄ£Ê½;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
		private List<Icommand> list=new ArrayList<Icommand>();  
		public void setList(Icommand icommand) {
			list.add(icommand);
		}
		public void Notify() {
			for (Icommand icommand : list) {
				icommand.Excute();
			}
		}

}

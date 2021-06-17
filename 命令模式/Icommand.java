package ÃüÁîÄ£Ê½;

public abstract class Icommand {
		protected Cook cook;
		public Icommand(Cook cook) {
			this.cook=cook;
		}
		public abstract void Excute();

}

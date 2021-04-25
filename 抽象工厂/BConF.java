package ³éÏó¹¤³§;

public class BConF implements BFruitAndVegetables{
	public Fruit CreateF() {
		Fruit banana = new Banana();
		return banana;
	}
	public Vegetables CreateV() {
		return null;
	}

}

package ³éÏó¹¤³§;

public class Main {
	public static void main(String args[]) {
		AFruitAndVegetables factory = new AConF();
		AFruitAndVegetables factory2 = new AConV();
		
		Fruit fruit = factory.CreateF();
		Vegetables vegetables = factory2.CreateV();
		
		fruit.eat();
		vegetables.eat();
	}

}

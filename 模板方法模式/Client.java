package 模板方法模式;

public class Client {
	 public static void main(String[] args){

	        System.out.println();
	        System.out.println("-----制作红枣豆浆步骤-------");
	        SoyaMilk reddatesSoyaMilk = new ReddatesSoyaMilk();
	        reddatesSoyaMilk.prepareRecipe();

	        System.out.println();
	        System.out.println("-----制作核桃豆浆步骤-------");
	        SoyaMilk nutSoyaMilk = new NutSoyaMilk();
	        nutSoyaMilk.prepareRecipe();

	    }
}

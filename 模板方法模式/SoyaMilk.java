package 模板方法模式;

public abstract class SoyaMilk {
	 final void  prepareRecipe(){
	        selectMaterial();
	        addCondiments();
	        soak();
	        beat();
	 }
	 void selectMaterial(){
         System.out.println("第一步、选择好了新鲜黄豆");
    }
	 abstract void addCondiments();
	 
	 void soak(){
	        System.out.println("第三步、黄豆和配料开始浸泡，大概需要5个小时");
	    }
	 void beat(){
	        System.out.println("第四步、黄豆的配料放到豆浆机打碎");
	    }
}

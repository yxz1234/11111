package ģ�巽��ģʽ;

public abstract class SoyaMilk {
	 final void  prepareRecipe(){
	        selectMaterial();
	        addCondiments();
	        soak();
	        beat();
	 }
	 void selectMaterial(){
         System.out.println("��һ����ѡ��������ʻƶ�");
    }
	 abstract void addCondiments();
	 
	 void soak(){
	        System.out.println("���������ƶ������Ͽ�ʼ���ݣ������Ҫ5��Сʱ");
	    }
	 void beat(){
	        System.out.println("���Ĳ����ƶ������Ϸŵ�����������");
	    }
}

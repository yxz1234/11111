package ������;

import java.util.Iterator;

public class SXMenu implements Menu{

	static final int MAX_ITEMS = 4;
    int indexOfItems = 0;
    MenuItem[] menuItems;

    /**
     * ͨ�����캯�����ڲ˵������һЩ��Ʒ
     */
    public SXMenu(){
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("�ཷ��˿�ǽ���",10.0);
        addItem("�����������ǽ���",10.0);
        addItem("ţ���������з�",15.0);
        addItem("���빽���з�",10.0);
    }

    public void addItem(String name, double price){
        MenuItem menuItem = new MenuItem(name, price);

        if(indexOfItems >= MAX_ITEMS){
            System.out.println("�˵�������");
        }else {
            menuItems[indexOfItems] = menuItem;
            indexOfItems ++;
        }
    }


    
    public Iterator<MenuItem> createIterator() {
        return new SXMenuIterator(menuItems);
    }
}


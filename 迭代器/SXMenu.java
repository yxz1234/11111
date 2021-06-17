package µü´úÆ÷;

import java.util.Iterator;

public class SXMenu implements Menu{

	static final int MAX_ITEMS = 4;
    int indexOfItems = 0;
    MenuItem[] menuItems;

    /**
     * Í¨¹ý¹¹Ôìº¯Êý£¬ÔÚ²Ëµ¥ÀïÌí¼ÓÒ»Ð©²ËÆ·
     */
    public SXMenu(){
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Çà½·ÈâË¿¸Ç½½·¹",10.0);
        addItem("Î÷ºìÊÁ¼¦µ°¸Ç½½·¹",10.0);
        addItem("Å£ÈâÍÁ¶¹ìÒ×Ð·¹",15.0);
        addItem("½ðÕë¹½ìÒ×Ð·¹",10.0);
    }

    public void addItem(String name, double price){
        MenuItem menuItem = new MenuItem(name, price);

        if(indexOfItems >= MAX_ITEMS){
            System.out.println("²Ëµ¥ÒÑÂú£¡");
        }else {
            menuItems[indexOfItems] = menuItem;
            indexOfItems ++;
        }
    }


    
    public Iterator<MenuItem> createIterator() {
        return new SXMenuIterator(menuItems);
    }
}


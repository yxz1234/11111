package µü´úÆ÷;

import java.util.Iterator;

public class SXMenuIterator implements Iterator{
	MenuItem[] menuItems;
    int position = 0;

    
    public SXMenuIterator(MenuItem[] menuItems){
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(position >= menuItems.length || menuItems[position] == null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position += 1;
        return menuItem;
    }
}

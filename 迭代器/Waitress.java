package ������;

import java.util.Iterator;

public class Waitress {
	SXMenu sxMenu;
	 public Waitress(SXMenu sxMenu){
	        this.sxMenu = sxMenu;
	    }
	 public void printMenu(){
	        Iterator<MenuItem> iterator = sxMenu.createIterator();
	        System.out.println("ɳ�ز˵�Ϊ��");
	        printMenu(iterator);
	 }
	 private void printMenu(Iterator iterator){
	        while (iterator.hasNext()){
	            MenuItem menuItem = (MenuItem) iterator.next();
	            System.out.print(menuItem.getName() + ": ");
	            System.out.println(menuItem.getPrice());
	        }
	    }
	}
	
package µü´úÆ÷;

public class Client {
	public static void main(String[] args) {

        SXMenu sxMenu = new SXMenu();
        Waitress waitress = new Waitress(sxMenu);

        waitress.printMenu();
    }
}



package main.java;

public class App {
	public App(final String filename) {
		Database database = new Database(filename);
		do {
			clearScreen();
			Login login = new Login(database);
			clearScreen();
			Module module = new Module(login.getUserType());
		} while (Module.hasLogedOut());
	}

	public static void clearScreen() {  
		System.out.print("\033[H\033[2J");  
		System.out.flush();  
	}
}
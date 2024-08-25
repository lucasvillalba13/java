package d;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// while loop
		
		Scanner scanner = new Scanner(System.in);
		//String name = "";
		String gol = "";
		
		//while(name.isBlank()) {
		//	System.out.print("enter you name:  ");
		//	name = scanner.nextLine();
	//	}
		
		// do while
		
		do{
			System.out.print("fue gol?:  ");
			gol = scanner.nextLine();
		}while (gol.isBlank());
		
		if (gol.isBlank() == true){
			System.out.println("no fue gol");
		} else if (gol.isBlank() == false) {
			System.out.println("fue gol!");
		}
		
		//System.out.println("hello "+ name);
	}
}

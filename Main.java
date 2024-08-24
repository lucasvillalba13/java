package d;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*int temp = 20;
		
		if (temp <= 15) {
			System.out.println("hace frio");
		} else if (temp>=28 ) {
			System.out.println("hace calooooorrrr");
		} else if (temp > 20 && temp < 27);{
			System.out.println("ta hermoso afuera");
		} else {
			System.out.println("no salen ni las iguanas");
		}
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("you are playing a game! Press 'Q' or 'q' if you want to leave!");
		String response = scanner.next();
		
		//if (response.equals("q") || response.equals ("Q")) {
		//System.out.println("you have quited successfully");
		//} else {
		//	System.out.println("you are still plying the game");
		//}
		
		if (!response.equals("q") && !response.equals ("Q")) {
			System.out.println("you are still plying the game");
		} else {
			System.out.println("you have quited successfully");
		}
			
	}
}

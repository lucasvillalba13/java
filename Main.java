package d;
import java.io.File;


public class Main {

	public static void main(String[] args) {

		File file = new File("file.txt");
		// if the file exist in any other path within the computer you must write down the entire path

		if(file.exists()){
			System.out.println("this file.txt exists");
		} else {
			System.out.println("this file.txt does not exist");
		}
    }
}			

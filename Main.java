package d;
import java.io.*;


public class Main {

	public static void main(String[] args) {

//		File file = new File("file.txt");
//		// if the file exist in any other path within the computer you must write down the entire path
//
//		if(file.exists()){
//			System.out.println("this file.txt exists");
//		} else {
//			System.out.println("this file.txt does not exist");
//		}

//        try {
//            FileWriter writer = new FileWriter("file.txt");
//            writer.write("dani sos el amor de mi vidaaaaa~~");
//            writer.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        try {
            FileReader reader = new FileReader("file.txt");
			int data = reader.read();
			while (data != -1){
				System.out.print((char)data);
				data = reader.read();
			}
			reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}			

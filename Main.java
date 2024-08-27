package d;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		// for each
		
		//String[] animals = {"perro","gato","elefante","leon"};
		
		ArrayList<String> animales = new ArrayList<String>();
		
		animales.add("gato");
		animales.add("perro");
		animales.add("conejo");
		animales.add("loro");
		animales.add("hormiga");
		
		for (String i : animales){
			System.out.println(i);
		}
		
	}
}
			

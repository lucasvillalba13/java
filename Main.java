package d;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		// Array list 2D listas dinamicas
		
		ArrayList<ArrayList<String>> compras = new ArrayList();
	
		ArrayList<String> listaSuper = new ArrayList();
		
		listaSuper.add("pechuga de pollo");
		listaSuper.add("aceite");
		listaSuper.add("azucar");
		listaSuper.add("harina");
		listaSuper.add("vinito");
		
		
		ArrayList<String> listaFeria = new ArrayList();
		
		listaFeria.add("frutas");
		listaFeria.add("papas");
		listaFeria.add("huevos");
		listaFeria.add("cebolla");
		listaFeria.add("zanahoria");
		
		compras.add(listaFeria);
		compras.add(listaSuper);
		
		System.out.println(compras.get(1).get(3));
		
		
	}
}
			

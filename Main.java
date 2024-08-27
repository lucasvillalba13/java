package d;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		// overloaded methods = metodos que comparten el mismo nombre pero tienen difernetes parametros
		// method name + parametros = method signature
		
		int x = add(2,6,5,6);
		
		System.out.println(x);

	}
	
	static int add(int a, int b) {
		System.out.println("#1");
		return a + b;
	}
	
	static int add(int a, int b, int c) {
		System.out.println("#2");
		return a + b + c;
	}
	
	static int add(int a, int b, int c, int d) {
		System.out.println("#3");
		return a + b + c + d;
	}
	
}			

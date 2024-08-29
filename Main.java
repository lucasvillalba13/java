package d;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Car myCar = new Car();
		Car macriMovil = new Car();

		System.out.println(myCar.model);
		System.out.println(myCar.year);

		System.out.println(macriMovil.model);
		System.out.println(macriMovil.color);

		myCar.drive();
		myCar.brake();
	}
}			

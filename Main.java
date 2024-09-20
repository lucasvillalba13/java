package d;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		try{
			System.out.println("enter a number to divide");
			int x = scanner.nextInt();

			System.out.println("enter a number to divide by");
			int y = scanner.nextInt();

			int z = x/y;
			System.out.println("el resultado es: " + z);
		} catch (ArithmeticException e){
			System.out.println("un numero no se puede dividir por cero");
		} catch (InputMismatchException e){
			System.out.println("pone un numero flaco");
		} finally {
			scanner.close();
		}


//
//		Garage garage = new Garage(10);
//
//		Vehicle car1 = new Car("NJF042");
//		Vehicle bici = new Bycicle("MEM912");
//		Vehicle camion = new Truck("ACM1PT");
//
//		//array de objetos utilizando polimorfismo
//		Vehicle[] polimor = {car1,bici,camion};
//
//		garage.addVehicle(car1);
//		garage.addVehicle(bici);
//
//
//		try {
//			Thread.sleep(60000); // Esperar 60 segundos (1 minuto)
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//
//		long timeStored = garage.calculateStoredTime("NJF042");
//		System.out.println("Time stored (in minutes): " + timeStored);
//
//		garage.removeVehicle("NJF042");

//		Professor profe = new Professor();
//
//		profe.Reading();
    }
}			

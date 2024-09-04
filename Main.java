package d;

public class Main {

	public static void main(String[] args) {

		Car Car1 = new Car(2020, "corolla", "black", 25000);
		Car Car2 = new Car(2024, "etios", "white", 22000);

		Car1.drive();

		Pibes Lucas = new Pibes("lucas", 22, "programming", true, true);
		Pibes Giuli = new Pibes("giuli", 21, "ts", true, true);
		Pibes Tucu = new Pibes("Tucu", 21, "English", false, true);

		System.out.println(Car1);
		System.out.println(Lucas);

		Dice dice = new Dice();
	}
}			

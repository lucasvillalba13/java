package d;

public class Main {

	public static void main(String[] args) {

//		Car Car1 = new Car(2020, "corolla", "black", 25000);
//		Car Car2 = new Car(2024, "etios", "white", 22000);
//
//		Car1.drive();
//
//		Pibes Lucas = new Pibes("lucas", 22, "programming", true, true);
//		Pibes Giuli = new Pibes("giuli", 21, "ts", true, true);
//		Pibes Tucu = new Pibes("Tucu", 21, "English", false, true);
//
//		System.out.println(Car1);
//		System.out.println(Lucas);
//
//		Dice dice = new Dice();

//		Comida[] heladera = new Comida[3];
//
//		Comida almuerzo1 = new Comida("pizza","masa", "horno", 15);
//		Comida almuerzo2 = new Comida("tortilla de papa", "papa", "sarten",25 );
//		Comida almuerzo3 = new Comida("milanesa","pollo", "horno", 40);
//
//		heladera[0] = almuerzo1;
//		heladera[1] = almuerzo2;
//		heladera[2] = almuerzo3;
//
//		System.out.println(heladera[0]);

//
//		String[] newJeansSongs = {"Hype boy","CWY","Ditto","How sweet", "Supernatural"};
//
//		NewJeans Danielle = new NewJeans("Danielle", 19, "yellow", "Ador",newJeansSongs);
//		NewJeans Minji = new NewJeans("Minji", 20, "blue", "Ador",newJeansSongs);
//		NewJeans Hanni = new NewJeans("Hanni", 20, "pink", "Ador", newJeansSongs);
//		NewJeans Hyein = new NewJeans("Hyein", 16, "violet", "Ador", newJeansSongs);
//		NewJeans Haerin = new NewJeans("Haerin", 18, "green", "Ador", newJeansSongs);
//
//
//
//		System.out.println(Danielle.sing(2));
	Car car1 = new Car("fiat", 2023,"gris",15000);
	Car car2 = new Car(car1);

//	car2.copy(car1);

		System.out.println(car1);
		System.out.println(car2);

		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println(car1.getColor());
		System.out.println(car1.getPrice());

		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
		System.out.println(car2.getColor());
		System.out.println(car2.getPrice());
    }
}			

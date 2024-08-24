package d;

public class Main {

	public static void main(String[] args) {

		String day = "fobal";
		
		switch (day) {
			case "Sunday": System.out.println("it is sunday!");
			break;
			case "Monday": System.out.println("it is monday!");
			break;
			case "Tuesday": System.out.println("it is tuesday!");
			break;
			case "Wednesday": System.out.println("it is wednesday!");
			break;
			case "Thursday": System.out.println("it is thursday!");
			break;
			case "Friday": System.out.println("it is friday!");
			break;
			case "Saturday": System.out.println("it is saturday!");
			break;
			default: System.out.println("that is not a day");
		}
	}
}
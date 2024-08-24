package d;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Random random = new Random();
		System.out.println(random);
		
		int x = random.nextInt();
		if (x >= 18){
			System.out.println("podes pasar al boliche");
		} else if(x >=30){
			System.out.println("podes pasar pero sos alto viejardo breother");
		} else if (x <= 18);{
			System.out.println("no podes pasar sos alta menorcita");
		} else {
			System.out.println("guien so");
		}
			
	
	}
}
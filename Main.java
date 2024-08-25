package d;

public class Main {

	public static void main(String[] args) {

		// arrays
		
	//String[] cars = {"Camaro","Fiat", "Mercedes"};	
	//System.out.println(cars[0]);
	
	//String[] materias = new String[4];
			
	//materias[0] = "teorias del aprendizaje";
	//materias[1] = "seminario";
	//materias[2] = "epistemologia";
	//materias[3] = "didactica";
	
	//for (int i=0; i<materias.length; i++) {
		//System.out.println(materias[i]);
		//}
		
		// 2D arrays 
		
		/*String[][] cars = new String[3][3];
		
		cars[0][0] = "208";
		cars[0][1] = "corolla";
		cars[0][2] = "corolla";
		cars[1][0] = "palio";
		cars[1][1] = "hilux";
		cars[1][2] = "corolla";
		cars[2][0] = "vento";
		cars[2][1] = "Q5";
		cars[2][2] = "corolla";
		
		for(int i = 0; i<cars.length; i++) {
			System.out.println();
			for(int j = 0; j<cars[i].length;j++) {
				System.out.print(cars[i][j]+ " ");
			}*/
		
			String[][] cars = { {"208","corolla","corolla"},
								{"palio","hilux","corolla"},
								{"vento","Q5","corolla"}
						};
			
			for(int i = 0; i<cars.length; i++) {
				System.out.println();
				for(int j = 0; j<cars[i].length;j++) {
					System.out.print(cars[i][j]+ " ");
				}
			}
	}
}
			

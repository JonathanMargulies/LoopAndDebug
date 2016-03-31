public class LoopAndDebug {
	public static void main(String [] args) {
		for (int i=1; i<100; i+=2 ) {
			System.out.println(i);
		}
		int a = 2;
		do {
			System.out.println(a);
			a+=2;
		} while (a<=100);

		while (true){
			System.out.println("  *  ");
			System.out.println("");
			System.out.println(" *** ");
			System.out.println("");
			System.out.println("*****");
			System.out.println("");
			System.out.println(" *** ");
			System.out.println("");
			System.out.println("  *  ");
			break;
		}

	}
}

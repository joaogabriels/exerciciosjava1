import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor: ");
	
		double val = sc.nextInt();
		
		if(val < 0 || val > 100 ) {
			System.out.println("Fora de intervalo");
		
		}else if(val <= 25) {
			System.out.println("Intervalo (0,25]"); 
		
		}else if (val <= 50) {
			System.out.println("Intervalo (25,50]");
	
		}else if (val <= 75 ) {
			System.out.println("Intervalo (50,75]");

		}else {
			System.out.println("Intervalo (75,100]");
		}
		
		sc.close();
	}
}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n;
		
		System.out.println("Digite o N�mero:");
		n = sc.nextDouble();
		
		if(n >= 0) {
			System.out.println("N�o negativo");
		}else {
			System.out.println("Negativo");

		sc.close();
		}
	}
}
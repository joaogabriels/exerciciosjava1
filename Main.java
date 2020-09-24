import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n;
		
		System.out.println("Digite o Número:");
		n = sc.nextDouble();
		
		if(n >= 0) {
			System.out.println("Não negativo");
		}else {
			System.out.println("Negativo");

		sc.close();
		}
	}
}
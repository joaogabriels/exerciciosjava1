import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digte o código do item e sua quantidade:");		// TODO Auto-generated method stub

			int cod = sc.nextInt();
			int qtd = sc.nextInt();
		
			double t;
			
			if(cod == 1 ) {
				t = 4 * qtd;
			}else if(cod == 2){
				t = 4.5 * qtd;
			}else if(cod == 3){
				t = 5 * qtd;
			}else if(cod == 4){
				t = 2 * qtd;
			}else {
				t = 1.5 * qtd;
			}
			
			System.out.printf("Total: R$ %.2f%n", t);

			sc.close();
	}

}

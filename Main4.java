import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite as horas iniciais e finais do evento:");
		
		int h1 = sc.nextInt(); // hora inicial
		int h2 = sc.nextInt(); // hora final
	
		int res; 
		
		if(h1 < h2 ) {
			res = h2 - h1;
			
		} else {
			res = 24 - h1 + h2;
		}
		
		System.out.println("O JOGO DUROU " + res + " HORAS");
		
		sc.close();
	}

}

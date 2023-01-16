import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int resultado = 0;
		
		System.out.println("Digite o primeiro numero: ");
		int n1 = sc.nextInt();
		System.out.println("Digite o segundo numero:");
		int n2 = sc.nextInt();
		
		System.out.println("Para somar os numeros digite 1!");
		System.out.println("Para subtrair os numeros digite 2!");
		int aux = sc.nextInt();
		
		if (aux == 1) {
			resultado = n1+n2;			
		}
		else if (aux == 2 ) {
			resultado = n1-n2;
		}
		else {
			System.out.println("Numero invalido!");
		}
		
		System.out.println("O resultado é:" + resultado);
	}
}

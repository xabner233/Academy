import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean tentativas = true;
		int num, negativos=0, zeros=0;
		
		while (tentativas) {
			
			System.out.println("Digite um numero:");
			num = sc.nextInt();
			
			if (num == 0) {
				zeros++;							
			}
			else if (num < 0) {
				negativos++;
			}
			
			if (num == -25) {
				tentativas=false;						
			}
		}
		System.out.println(negativos+" numeros negativos");
		System.out.println(zeros + " numeros zeros");
		
	}

}

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int maior;
		
		System.out.println("Escreva o primeiro numero");
		int n1 = sc.nextInt();		
		
		System.out.println("Escreva o segundo numero");
		int n2 = sc.nextInt();
		
		System.out.println("Escreva o terceiro numero");
		int n3 =sc.nextInt();
		
		if (n1>n2) {
			maior = n1;
		}
		else 
		{
			maior = n2;
		}			
			
		if(n2>n3) {
			maior = n2;			
		}
		else {
			maior = n3;
		}
		
		System.out.println(maior);
	}

}

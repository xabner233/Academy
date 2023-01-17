import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("Digite o numero do mes:");
	int mes = sc.nextInt();
	
	if (mes == 2) {
		System.out.println("28 dias");		
	}
	else if (mes == 1 || mes == 3|| mes == 5|| mes == 7|| mes == 8 || mes == 10 || mes == 12 ) {
		System.out.println("31 dias");
	}
	else if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
		System.out.println("30 dias");
	}
	else {
		System.out.println("Mes invalido");
	}
}
}

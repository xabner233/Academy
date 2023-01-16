import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a Hora");
		int hora = sc.nextInt();
		System.out.println("Digite os Minutos");
		int minutos = sc.nextInt();
		System.out.println("Digite os segundos");
		int segundos = sc.nextInt();
		
		if (hora < 25 && minutos < 60 && segundos < 60) {
			System.out.println("Hora valida!");
			System.out.println(hora + ":" + minutos + ":" + segundos);
		}
		else {
			System.out.println("Hora Invalida!");
			
		}
	}

}


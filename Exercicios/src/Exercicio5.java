import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean tentativa = true;
		System.out.println("Digite uma letra: ");
		
		while (tentativa) {
			
			char caratcer =  sc.next().charAt(0);
			if (caratcer=='a') {
				System.out.println("7");
				tentativa = false;
			}
			else if (caratcer=='b') {
				System.out.println("8");
				tentativa = false;
			}
			else if (caratcer == 'c') {
				System.out.println("101");
				tentativa = false;
			}
			else {
				System.out.println("Digite outra letra!");
			}
			
		}
		
		
			
		}
	}



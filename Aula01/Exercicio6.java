import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {

		List<String> nomes = new ArrayList<String>();

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 7 palavras");

		for (int i = 0; i < 7; i++) {
			String nome = sc.next();
			nomes.add(nome);
		}

		Collections.sort(nomes);

		System.out.println(nomes);
	}
}

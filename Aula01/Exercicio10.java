import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		System.out.println("Gigite um numero");
		Scanner sc = new Scanner(System.in); 

		String num = sc.nextLine(); 
		String result = new StringBuffer(num).reverse().toString();
		System.out.println(result);

	}

}

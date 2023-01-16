import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Escreva uam palavra");		
		String text = sc.nextLine(); 
		
		System.out.println("Digite o caracter desejado");
		char caracter = sc.next().charAt(0);
		int count=0;
        for (int i=0;i<text.length();i++){
            if(text.charAt(i)==caracter){
                count++;
            }
        }
        System.out.println(count);

	}
}

import java.util.Scanner;

public class VerificarSenha {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero de senhas que seão armazenados: ");
		int aux = sc.nextInt();

		Senha[] arraySenha = new Senha[aux];

		System.out.println("Digite o tamanho da senha: ");
		Integer tamanhoSenha = sc.nextInt();
			
		fillArray(arraySenha, tamanhoSenha);

		Senha[] copiarSenha = arraySenha.clone();
		sortArray(copiarSenha);

		System.out.println("Contraseñas ordenadas: ");
		for (short i = 0; i < copiarSenha.length; i++) {
			System.out.println(copiarSenha[i].getContrasenha());
		}

		System.out.println("Todas las contraseñas: ");
		for (short i = 0; i < arraySenha.length; i++) {
			System.out.println(arraySenha[i].getContrasenha() + " " + Senha.senhaForte(arraySenha[i].getContrasenha()));
		}
	}

	private static void fillArray(Senha[] passwords, Integer sizePasswords) {
		for (short i = 0; i < passwords.length; i++) {
			Senha newPassword = new Senha(sizePasswords);
			passwords[i] = newPassword;
		}
	}

	private static void sortArray(Senha[] senha) {
		Senha aux;
		for (int i = 0; i < senha.length; i++) {
			for (int j = i + 1; j < senha.length; j++) {
				int comparar = senha[i].getContrasenha().compareToIgnoreCase(senha[j].getContrasenha());
				if (comparar > 0) {
					aux = senha[i];
					senha[i] = senha[j];
					senha[j] = aux;
				}
			}
		}

	}
}

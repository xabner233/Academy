import java.util.Scanner;

public class VerificarSenha {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero de senhas que seão armazenados: ");
		int aux = sc.nextInt();

		Senha[] arrayPws = new Senha[aux];

		System.out.println("Digite o tamanho da senha: ");
		Integer tamanhoSenha = sc.nextInt();

		fillArray(arrayPws, tamanhoSenha);

		Senha[] copyPws = arrayPws.clone();
		sortArray(copyPws);

		System.out.println("Contraseñas ordenadas: ");
		for (short i = 0; i < copyPws.length; i++) {
			System.out.println(copyPws[i].getContrasenha());
		}

		System.out.println("Todas las contraseñas: ");
		for (short i = 0; i < arrayPws.length; i++) {
			System.out.println(arrayPws[i].getContrasenha() + " " + Senha.senhaForte(arrayPws[i].getContrasenha()));
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
				int compare = senha[i].getContrasenha().compareToIgnoreCase(senha[j].getContrasenha());
				if (compare > 0) {
					aux = senha[i];
					senha[i] = senha[j];
					senha[j] = aux;
				}
			}
		}

	}
}

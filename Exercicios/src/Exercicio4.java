import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean tentativas = true, ascessoConta = false;
		int cont =0;
		
		System.out.println("Digite o nome de usuario:");
		String usuario = sc.nextLine();
		System.out.println("Digite a senha:");
		String senha = sc.nextLine();
		String usuarioLogin, senhaLogin;
		
		while (tentativas) {
			System.out.println("Digite seu usuario:");
			usuarioLogin = sc.nextLine();
			System.out.println("Digite a senha:");
			senhaLogin = sc.nextLine();
			
			if (senha.equals(senhaLogin)  && usuario.equals(usuarioLogin) ) {
				tentativas = false;
				ascessoConta = true;
			}
			else {
			
				System.out.println("Usuario ou senha incorreto, tente novamente!");
				System.out.println("Você tem ainda "+ (2 - cont) + " tentativas!");
				cont++;
			}
			
			if (cont > 2 ) {
				
				tentativas = false;
				ascessoConta = false;
			}
			
		}
		
		if (ascessoConta == true) {
			System.out.println("Bem vindo "+ usuario);
			
		}
		else {
			System.out.println("Conta bloqueada!");
		}

	}
}

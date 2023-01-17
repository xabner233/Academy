import java.security.SecureRandom;

public class Senha {

	private int comprimento ;
	private String contrasenha;

	public Senha() {
	 this.comprimento = 8;
	}
	public Senha(Senha senha) {
		this.comprimento = senha.comprimento;
		this.contrasenha = senha.contrasenha;
	}

	public Senha(int comprimento) {

		this.comprimento = comprimento;
		this.contrasenha = gerarContraSenha(comprimento);
	}

	public Integer getComprimento() {
		return comprimento;
	}

	public void setComprimento(Integer comInteger) {
		this.comprimento = comprimento;
	}

	public String getContrasenha() {
		return contrasenha;
	}

	public static boolean senhaForte(String senha) {
		return forcaSenha(senha);
	}

	private String gerarContraSenha(int comprimento) {
		final String aleatorio = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		SecureRandom random = new SecureRandom();
		StringBuilder sb = new StringBuilder(comprimento);
		for (int i = 0; i < comprimento; i++)
			sb.append(aleatorio.charAt(random.nextInt(aleatorio.length())));
		return sb.toString();
	}

	private static boolean forcaSenha(String senha) {
		int digitos = 0;
		int upperCases = 0;
		int lowerCases = 0;
		char ch;

		for (int i = 0; i < senha.length(); i++) {
			ch = senha.charAt(i);

			if (Character.isDigit(ch)) {
				digitos++;
			} else if (Character.isUpperCase(ch)) {
				upperCases++;
			} else if (Character.isLowerCase(ch)) {
				lowerCases++;
			}
		}

		if (digitos > 5 && upperCases > 2 && lowerCases > 1) {
			return true;
		} else {
			return false;
		}

	}

}

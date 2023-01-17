public class Hexagono {
	public static void main(String[] args) {
		int dimensao1 = 4, dimensao2 = 10, aux = 3;
		aux = dimensao1;

		for (int linha = 0; linha < 7; linha++) {				
			
			aux--;

			if (linha < 3) {
				for (int pos = 0; pos < 10; pos++) {

					if (pos < 3 - linha) {
						System.out.print(" ");
					}

					if (pos > 3 - linha && pos < 11 - aux) {
						System.out.print("+");
					}
				}
				System.out.println();
			}
			if (linha == 3) {
				for (int pos = 0; pos < 10; pos++) {

					System.out.print("+");

				}
				System.out.println();
			}

				if (linha > 3) {

					for (int pos = 0; pos < 10; pos++) {

						if (pos < linha - 3) {
							System.out.print(" ");
						}

						if (pos > linha - 3 && pos < aux + 11) {
							System.out.print("+");
						}
					}
					System.out.println();
				}

			

		}
	}
}

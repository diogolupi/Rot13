import java.util.Scanner;

public class CriptografiaROT13 {
	private static String criptografar(String texto) {
		String criptograma = "";
		
		for (int i = 0 ; i < texto.length() ; i++) {
			int caractereOriginal = texto.charAt(i);
			int caractereFinal = 0;
			if (caractereOriginal < 97 || caractereOriginal > 122) {
				caractereFinal = caractereOriginal;
			} else {
				caractereFinal = caractereOriginal += 13;
				if (caractereFinal > 122) {
					caractereFinal -= 26;
				}
			}
			criptograma += ((char) caractereFinal);
		}

		return criptograma;
	}
	
	public static void main (String args[]) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite um texto: ");
		String texto = leitor.nextLine();
		
		String cripograma = criptografar(texto);
		
		System.out.println("O criptograma é: " + cripograma);
		leitor.close();
		}
}
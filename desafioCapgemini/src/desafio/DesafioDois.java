package desafio;

import java.util.Scanner;

/** Classe do Desafio Dois
 * @author Eri Almeida
 * @version 1.0.0.0
 * @since 20/02/2022
 */    

public class DesafioDois {
	
	
	/**Método principal da classe
	 * Instancia um Scanner para capturar valor inteiro digitado pelo usuario 
	 * @return void
	 * @param args
	 */
	
	public static void main(String[] args) {

		System.out.print("Digite a senha :");

		Scanner entrada = new Scanner(System.in);
		String senha = entrada.next();
		entrada.close();

		if (!verificaTamanho(senha)) {
			System.out.printf("Sua senha possui %d caracters, faltam %d caracteres \n", senha.length(),
					(6 - senha.length()));
		} else if (!verificaDigito(senha)) {
			System.out.println("Sua senha nao possui números, deve possuir pelo menos um ");
		} else if (!verificaLower(senha)) {
			System.out.println("Sua senha nao possui letras minusculas, deve possuir pelo menos uma");
		} else if (!verificaUpper(senha)) {
			System.out.println("Sua senha nao possui letras maiuscula, deve possuir pelo menos uma");
		} else if (!verificaSpecial(senha)) {
			System.out.println("Sua senha nao possui caracteres especiais, deve possuir pelo menos um");
		} else {
			System.out.println("Sua senha atende aos criterios minimos aceitaveis ");
		}

	}


	/**Método verificaTamanho 
	 * com base no valor digitado verifica se existe o tamanho minimo de caracteres
	 * @return boolean 
	 * @param valor - valor digitado pelo usuario
	 */
	
	private static boolean verificaTamanho(String valor) {
		boolean retorno = true;
		if (valor.length() < 6) {
			retorno = false;
		}
		return retorno;
	}


	/**Método verificaDigito
	 * com base no valor digitado verifica se existe o pelo menos um digito
	 * @return boolean 
	 * @param valor - valor digitado pelo usuario
	 */
	
	private static boolean verificaDigito(String valor) {
		boolean retorno = false;
		for (char digit : valor.toCharArray()) {
			if (Character.isDigit(digit)) {
				retorno = true;
			}
		}
		return retorno;
	}


	/**Método verificaLower 
	 * com base no valor digitado verifica se existe o pelo menos uma letra minuscula
	 * @return boolean 
	 * @param valor - valor digitado pelo usuario
	 */
	
	private static boolean verificaLower(String valor) {
		boolean retorno = false;
		for (char low : valor.toCharArray()) {
			if (Character.isLowerCase(low)) {
				retorno = true;
			}
		}
		return retorno;
	}
	
	/**Método verificaUpper 
	 * com base no valor digitado verifica se existe o pelo menos uma letra maiuscula
	 * @return boolean 
	 * @param valor - valor digitado pelo usuario
	 */
	
	private static boolean verificaUpper(String valor) {
		boolean retorno = false;
		for (char upper : valor.toCharArray()) {
			if (Character.isUpperCase(upper)) {
				retorno = true;
			}
		}
		return retorno;
	}

	/**Método verificaSpecial 
	 * com base no valor digitado verifica se existe o pelo menos um caractere especial
	 * @return boolean 
	 * @param valor - valor digitado pelo usuario
	 */
	private static boolean verificaSpecial(String valor) {
		boolean retorno = false;
		for (char sp : valor.toCharArray()) {
			if (!Character.isLetter(sp) && !Character.isDigit(sp)) {
				retorno = true;
			}
		}
		return retorno;
	}
}

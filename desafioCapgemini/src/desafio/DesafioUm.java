package desafio;

import java.util.Scanner;

/** Classe do Desafio Um
 * @author Eri Almeida
 * @version 1.0.0.0
 * @since 20/02/2022
 */    
public class DesafioUm {
	
	/**Método principal da classe
	 * Instancia um Scanner para capturar valor inteiro digitado pelo usuario 
	 * @return void
	 * @param args
	 */
	public static void main(String[] args) {
        
		System.out.print("Digite o valor de elementos (inteiro) :");
		Scanner entrada = new Scanner(System.in);		
		try {
			int valor = entrada.nextInt();
			escada(valor);

		} catch (Exception e) {
			System.out.println("Valor não corresponde a um valor inteiro");			
		}
		entrada.close();
		
	}
	
	/**Método escada 
	 * com base no valor digitado pelo usuario constroi a escada 
	 * @return void
	 * @param iteracao - valor inteiro digitado pelo usuario
	 */
	private static void escada(int iteracao) {

		String resultado = "";
		int i;

		for (i = 1; i <= iteracao; i++) {

			resultado += degrau(iteracao, i);

			if (i != iteracao) {
				resultado += "\n";
			}
		}
		System.out.print(resultado);
	}
	/**Método degrau
	 * com base no valor digitado pelo usuario constroi a escada 
	 * @return String - contendo cada linha de * 
	 * @param iteracao - valor inteiro digitado pelo usuario
	 * @param externo - posicao do laço anterior 
	 */
	private static String degrau(int iteracao, int externo) {
		char base = '*';
		char space = ' ';
		String retorno = "";
		int j;

		for (j = 0; j < iteracao; j++) {

			if (j < (iteracao - externo)) {
				retorno += space;
			} else {
				retorno += base;
			}
		}

		return retorno;
	}

}

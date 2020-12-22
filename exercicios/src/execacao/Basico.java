package execacao;

import oo.composicao.Aluno;

public class Basico {
	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		/*O try catch funciona para tratamento de eceções. De forma que ele tenta executar um bloco de código, caso não consiga
		 * ele é capaz de entrar no catch e transmitir uma mensagem de erro. Para alguns erros não é preciso mostrar ao usuario
		 * o seu problema, de forma que muitos erros são tratados de forma a guardar em um arquivo separado e orientado para o
		 * desenvolvedor. Esses arquivos são chamados de arquivo de log, coleta e armazenamento de dados para posterior verificação
		 *   */
		try {
			System.out.println(a1.getNome());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println( 7 / 0);
		} catch (Exception e) {
			System.out.println("Não pode dividir por zero");
		}
		System.out.println("Fim do programa! :)");
		
	}
}

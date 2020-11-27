package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filtro {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 8.9);
		Aluno a2 = new Aluno("Fia", 7.7);
		Aluno a3 = new Aluno("Lia", 5.6);
		Aluno a4 = new Aluno("Gui", 4.0);
		Aluno a5 = new Aluno("Giu", 10);
		Aluno a6 = new Aluno("Ju", 9.5);
		Aluno a7 = new Aluno("Pedro", 6.5);
		Aluno a8 = new Aluno("Eva", 3.5);
		
		List<Aluno> listaAlunos = Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8);
		Consumer<Object> println = System.out::println;
		Predicate<Aluno> aprovados = aprovado -> aprovado.nota >= 7;
		Predicate<Aluno> reprovados = reprovado -> reprovado.nota < 7;
		Function<Aluno, String> felicitacoes = aluno -> "Parabéns " + aluno.nome + " Com seu " + aluno.nota + " você foi aprovado!";
		Function<Aluno, String> pezares = aluno ->  aluno.nome + ", Infelizmente Com seu " + aluno.nota + " você foi reprovado!";
		
		
		listaAlunos.stream().filter(aprovados).map(felicitacoes).forEach(println);
		System.out.println("\n\n\nREPROVADOS:\n");
		listaAlunos.stream().filter(reprovados).map(pezares).forEach(println);	
		
	}

}

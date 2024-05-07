import java.util.ArrayList;
import java.util.List;

public class TreinoPosteriorOmbro extends Treino {
	public TreinoPosteriorOmbro() {
		super("Treino de perna posterior");
		inicializarExercicios();
	}

	private void inicializarExercicios() {
		List<Exercicio> exercicios = new ArrayList<>();
		exercicios.add(new Exercicio("Levantamento terra ", "10 - 12"));
		exercicios.add(new Exercicio("Stiff ", "10 - 12"));
		exercicios.add(new Exercicio("Cadeira flexora ", "10 - 15"));
		exercicios.add(new Exercicio("Levantamento lateral ", "8 - 10"));
		exercicios.add(new Exercicio("Desenvolvimento ", "8 - 10"));
		exercicios.add(new Exercicio("Remada alta no cross ", "8 - 10"));
		exercicios.add(new Exercicio("Encolhimento de ombros ", "8 - 10"));
		setExercicios(exercicios);
	}
}
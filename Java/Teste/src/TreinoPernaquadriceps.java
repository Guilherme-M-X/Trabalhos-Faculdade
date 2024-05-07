import java.util.ArrayList;
import java.util.List;

public class TreinoPernaquadriceps extends Treino {
	public TreinoPernaquadriceps() {
		super("Treino de perna quadríceps");
		inicializarExercicios();
	}

	private void inicializarExercicios() {
		List<Exercicio> exercicios = new ArrayList<>();
		exercicios.add(new Exercicio("Agachamento smith ", "10 - 12"));
		exercicios.add(new Exercicio("Leg press ", "10 - 12"));
		exercicios.add(new Exercicio("Cadeira extensora ", "10 - 15"));
		exercicios.add(new Exercicio("Afundo com barra ", "10"));
		exercicios.add(new Exercicio("Panturrilha sentado ", "15 - 20"));
		exercicios.add(new Exercicio("Panturrilha em pé ", "15 - 20"));
		setExercicios(exercicios);
	}
}
import java.util.ArrayList;
import java.util.List;

public class TreinoCostas extends Treino {
	public TreinoCostas() {
		super("Treino de costas");
		inicializarExercicios();
	}

	private void inicializarExercicios() {
		List<Exercicio> exercicios = new ArrayList<>();
		exercicios.add(new Exercicio("Remada na máquina ", "8 - 10"));
		exercicios.add(new Exercicio("Remada baixa", "8 - 10"));
		exercicios.add(new Exercicio("Puxada aberta no pulley", "8 - 10"));
		exercicios.add(new Exercicio("Pullover polia", "8 - 10"));
		exercicios.add(new Exercicio("Bíceps unilateral polia ", "8 - 10"));
		exercicios.add(new Exercicio("Bíceps scott ", "8 - 10"));
		setExercicios(exercicios);
	}
}
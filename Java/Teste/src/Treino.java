import java.util.List;

public class Treino {
	private String nome;
	private List<Exercicio> exercicios;


	public Treino(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public List<Exercicio> getExercicios() {
		return exercicios;
	}

	public void setExercicios(List<Exercicio> exercicios) {
		this.exercicios = exercicios;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(nome).append("\n");
		for (Exercicio exercicio : exercicios) {
			sb.append(exercicio.toString()).append("\n");
		}
		return sb.toString();
	}

}
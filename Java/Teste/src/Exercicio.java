public class Exercicio {
	private String nome;
	private String repeticoes;

	public Exercicio(String nome, String repeticoes) {
		this.nome = nome;
		this.repeticoes = repeticoes;
	}

	public String getNome() {
		return nome;
	}

	public String getRepeticoes() {
		return repeticoes;
	}

	public String toString() {
		return nome + " | repeticoes = " + repeticoes;
	}
}
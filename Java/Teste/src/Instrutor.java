import java.util.ArrayList;
import java.util.Scanner;

public class Instrutor {
	private String nomeInstrutor;
	FileManager bancodeDados = new FileManager();
	Scanner sc = new Scanner(System.in);
	Aluno aluno = new Aluno();

	ArrayList<String> nomeInstrutores = new ArrayList<String>() {
		{
			add("Joao");
			add("Patroa");
		}
	};

	public Instrutor() {

	}

	public boolean verificarInstrutor(String nome) {
		if (nomeInstrutores.contains(nome)) {
			System.out.println("---Instrutor Selecionado---");
			this.nomeInstrutor = nome;
			bancodeDados.dadosInstrutor(nome);
			return true;
		} else {
			System.out.println("---NÃO foi encontrado o instrutor---");
			return false;
		}
	}

	public void listarInstrutores() {
		System.out.println(nomeInstrutores);
	}

	public void marcarTreino() {
		String nome;
		Integer aux;
		System.out.println("Alunos cadastrados: ");
		aluno.listarAlunos();
		System.out.println("Digite o nome do aluno que irá realizar o Treino: ");
		nome = sc.next();
		if (aluno.verificarAluno(nome) == true) {
			System.out.println("Instrutores disponíveis: ");
			listarInstrutores();
			System.out.println("Digite o nome do Instrutor: ");
			nomeInstrutor = sc.next();
			if (verificarInstrutor(nomeInstrutor) == true) {
				System.out.printf("Qual treino será realizado: \n1 - Treino Perna Quadriceps\n2 - Treino Posterior Ombro\n3 - Treino Costas\n");
				System.out.println("Digite o treino escolhido: ");
				aux = sc.nextInt();
				bancodeDados.dadosTreino(aux);
				bancodeDados.adicionarRegistro();
			}
		}
	}

	public String getNomeInstrutor() {
		return nomeInstrutor;
	}

}

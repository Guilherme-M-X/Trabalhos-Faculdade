import java.util.Scanner;

public class Aluno {
	private String nomeAluno;
	FileManager bancodeDados = new FileManager();
	double aux_1, aux_2, aux_3;
	Scanner sc = new Scanner(System.in);

	public Aluno(String nome) {
		this.nomeAluno = nome;
	}

	public Aluno() {
	}
	
	public String getNome() {
		return nomeAluno;
	}

	public boolean verificarAluno(String nome) {
		if (bancodeDados.verificarAluno(nome) == true) {
			this.nomeAluno = nome;
			System.out.println("---Aluno Selecionado---");
			return true;
		} else {
			System.out.println("---Aluno não encontrado---");
			return false;
		}
	}

	
	
	@Override
	public String toString() {
		return "[Nomes dos Alunos = " + nomeAluno + "]";
	}

	public void progressoAluno() {
		System.out.println("Progresso do Aluno");
		System.out.println("Digite o peso do aluno quando entrou na academia: ");
		aux_1 = sc.nextDouble();
		System.out.println("Digite o peso do Aluno hoje em dia: ");
		aux_2 = sc.nextDouble();
		if (aux_1 >= aux_2) {
			System.out.println("---Aluno perdeu: " + (aux_1 - aux_2) + " kg---");
		} else {
			System.out.println("---Aluno Ganhou: " + (aux_2 - aux_1) + " kg---");
		}
		System.out.println("Digite a altura do Aluno: ");
		aux_1 = sc.nextDouble();
		if(((aux_2) / (aux_1 * aux_1))<=18.5) {
			System.out.println("Aluno está Abaixo do Peso normal");
		} else if(((aux_2) / (aux_1 * aux_1)) >= 18.6 || ((aux_2) / (aux_1 * aux_1)) <= 24.9){
			System.out.println("Aluno está com o Peso Ideal");
		} else if((((aux_2) / (aux_1 * aux_1)) >= 25 || ((aux_2) / (aux_1 * aux_1)) <= 29.9)) {
			System.out.println("Aluno está Levemente Acima do Peso");
		} else if (((aux_2) / (aux_1 * aux_1)) >= 30 || ((aux_2) / (aux_1 * aux_1)) <= 34.9) {
			System.out.println("Aluno está com Obesidade Grau 1");
		} else if (((aux_2) / (aux_1 * aux_1)) >= 35 || ((aux_2) / (aux_1 * aux_1)) <= 39.9) {
			System.out.println("Aluno está com Obesidade Grau 2");
		} else {
			System.out.println("Aluno está com Obesidade 3");
		}
		System.out.printf("IMC do aluno: %.2f\n", ((aux_2) / (aux_1 * aux_1)));
	}

	public void listarAlunos() {
		System.err.println(FileManager.listaAlunos());
	}

}

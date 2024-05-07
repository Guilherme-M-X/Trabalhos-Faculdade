import java.util.Scanner;


public class Principal {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		Treino TreinoCostas = new TreinoCostas();
		//Treino TreinoPeito = new TreinoPeito();
		Treino TreinoPernaquadriceps = new TreinoPernaquadriceps();
		Treino TreinoPosteriorOmbro = new TreinoPosteriorOmbro();
		Instrutor instrutor = new Instrutor();
		FileManager bancodeDados = new FileManager();
		bancodeDados.inicializarBancodedados();
		String nome;
		int op;

		// MENU
		System.out.println("-------------Menu------------");
		System.out.println("1 -> Marcar treino.");
		System.out.println("2 -> Listar treinos.");
		System.out.println("3 -> Treinos marcados.");
		System.out.println("4 -> Listar alunos.");
		System.out.println("5 -> Listar instrutores.");
		System.out.println("6 -> Remover Treinos do Aluno");
		System.out.println("7 -> Progresso");
		System.out.println("8 -> Excluir todos os treinos");
		System.out.println("0 -> Finalizar.");
		System.out.println("-----------------------------");
		do {
			System.out.println("Digite a opção desejada: ");
			op = sc.nextInt();
			switch (op) {
			case 1:
				instrutor.marcarTreino();
				break;
			case 2:
				System.out.println("Treinos");
				System.out.println("Qual plano de treino quer visualizar:\n1 - Treino Perna Quadriceps\n2 - Treino Posterior Ombro\n3 - Treino Costas\n4 - Listar todos os Trienos\nDigite a Opção: ");
				op = sc.nextInt();
				switch (op) {
				case 1 :
					System.out.println(TreinoPernaquadriceps);
					break;
				case 2:
					System.out.println(TreinoPosteriorOmbro);
					break;	
				case 3:
					System.out.println(TreinoCostas);
					break;
				}
				break;
			case 3:
				bancodeDados.lerArquivoRegistro();
				System.out.println();
				break;
			case 4:
				aluno.listarAlunos();
				System.out.println();
				break;
			case 5:
				System.out.println("Nome dos Instrutores: ");
				instrutor.listarInstrutores();
				System.out.println();
				break;
			case 6:
				aluno.listarAlunos();
				System.out.println("Digite o nome do aluno no qual deseja remover os treinos: ");
				nome = sc.next();
				bancodeDados.removerDados(nome);
				System.out.printf("Treinos do aluno escolhido foram excluídos\n");
				break;
			case 7:
				aluno.progressoAluno();
				System.out.println();
				break;
			case 8:
				bancodeDados.limpezadoArquivo();
				System.out.println("Todos os treinos foram Excluídos\n");
				break;
			case 0:
				break;
			}
		} while (op != 0);

		bancodeDados.limpezadoArquivo();
		sc.close();
	}
}
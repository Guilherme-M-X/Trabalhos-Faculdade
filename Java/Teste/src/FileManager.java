import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FileManager {
	static Aluno aluno = new Aluno();
	static Instrutor instrutor = new Instrutor();
	Treino TreinoPernaquadriceps = new TreinoPernaquadriceps();
	Treino TreinoPosteriorOmbro = new TreinoPosteriorOmbro();
	static ArrayList<String> bancodeDados = new ArrayList<String>();
	//Modificar a localizaçao dos arquivos
	static String nomeArquivo = "C:\\Users\\Guilherme\\Desktop\\Java\\Java\\Teste\\NomesAlunos.txt";
	static String criarArquivo = "C:\\Users\\Guilherme\\Desktop\\Java\\Java\\Teste\\Academia.txt";
	static String criarArquivoModificado = "C:\\Users\\Guilherme\\Desktop\\Java\\Java\\Academia_Modificado.txt";
	static String nomeAluno;
	static String nomeInstrutor;
	static String treino;
	static Integer contador;
	static String procurada = instrutor.getNomeInstrutor();

	private static void lerArquivo() {
		try {
			Scanner scanner = new Scanner(new File(nomeArquivo));
			scanner.useDelimiter(";");

			while (scanner.hasNext()) {
				String nome = scanner.next().trim();
				bancodeDados.add(nome);
			}
			Collections.sort(bancodeDados);
			scanner.close();
		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo");
		}

	}

	public static List<Aluno> listaAlunos() {
		try {
			Scanner scanner = new Scanner(new File(nomeArquivo));
			scanner.useDelimiter(";");
			var alunos = new ArrayList<Aluno>();

			while (scanner.hasNext()) {
				String nome = scanner.next().trim();
				alunos.add(new Aluno(nome));
			}
			scanner.close();
			return alunos;
		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo");
			return null;
		}

	}

	public void inicializarBancodedados() {
		lerArquivo();
	}

	public void bancodeDados() {
		System.out.println(bancodeDados);
	}

	@SuppressWarnings("static-access")
	public boolean verificarAluno(String procurado) {
		if (bancodeDados.contains(procurado)) {
			this.nomeAluno = procurado;
			return true;
		}
		return false;
	}

	public void dadosInstrutor(String nome) {
		nomeInstrutor = nome;
	}

	public void dadosTreino(Integer nome) {
		switch (nome) {
		case 1:
			treino = "Treino Perna Quadriceps";
			break;
		case 2:
			treino = "Treino Posterior ombro";
			break;
		case 3:
			treino = "Treino Costas";
		}
	}

	public static void criarArquivo() {
		try {
			BufferedWriter escritor = new BufferedWriter(new FileWriter(criarArquivo));
			BufferedWriter escritor2 = new BufferedWriter(new FileWriter(criarArquivoModificado));
			escritor.close();
			escritor2.close();
			System.out.println("Arquivo criado com sucesso: " + criarArquivo);
		} catch (IOException e) {
			System.out.println("Erro ao criar o arquivo: " + e.getMessage());
		}
	}


	public static void lerArquivoRegistro() {

		try {
			BufferedReader leitor = new BufferedReader(new FileReader(criarArquivo));
			String linha;

			while ((linha = leitor.readLine()) != null) {
				System.out.println(linha);
			}

			leitor.close();
		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo");
		}
	}

	public static void adicionarRegistro() {

		try {
			BufferedWriter escritor = new BufferedWriter(new FileWriter(criarArquivo, true));
			escritor.write("Nome do Aluno: " + nomeAluno + " , " + "Nome do Instrutor: " + nomeInstrutor + " , "
					+ "Treino: " + treino + " ;");
			escritor.newLine();
			escritor.close();
		} catch (IOException e) {
			System.out.println("Erro ao adicionar registro: " + e.getMessage());
		}
	}

	public static void removerDados(String nome) {
		List<String> linhas = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(criarArquivo));
				BufferedWriter writer = new BufferedWriter(new FileWriter(criarArquivoModificado, false))) {

			String linhaAtual;

			while ((linhaAtual = reader.readLine()) != null) {
				if (!linhaAtual.contains(nome)) {
					linhas.add(linhaAtual);
					writer.write(linhaAtual);
					writer.newLine();
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Erro" + e.getMessage());
		}
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(criarArquivo, false))) {

			for (String linha : linhas) {
				writer.write(linha);
				writer.newLine();
			}
		} catch (IOException e) {
			System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
		}
	}

	public void limpezadoArquivo() {
		try (FileWriter writer = new FileWriter(criarArquivo)) {
			writer.write("");
		} catch (IOException e) {
			System.out.println("Erro ao limpar o arquivo: " + e.getMessage());
		}
	}

}

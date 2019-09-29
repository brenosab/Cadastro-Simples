package modelo;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {

public static void main(String[] args) throws IOException {
		
		//NOVO ARQUIVO
		File arquivo = new File("Livros.txt");
		arquivo.createNewFile();
		
		
		//ESCRITA NO ARQUIVO
		FileWriter escritor = new FileWriter(arquivo);
		BufferedWriter ebuff = new BufferedWriter(escritor);
		
		
		
		
	Livraria livraria = new Livraria();





System.out.println("Estoque renovado com sucesso!");

//SEMPRE FECHAR OS ESCRITORES/LEITORES DE ARQUIVO

ebuff.close();
escritor.close();




	

	

}
}

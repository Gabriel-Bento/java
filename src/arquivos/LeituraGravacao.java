package arquivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LeituraGravacao {

	// método estático é aquele que posso acessar sem criar um objeto
	public static void gravar(String arquivo) {

		try {
			// objeto para gravação de texto
			FileWriter gravador = new FileWriter(arquivo);
			gravador.write("Primeira linha");
			gravador.write("\nBatatinhya qundo nasce...");
			gravador.write("\nBatatinha 1 2 3");
			gravador.write("\nÚltima linha");

			// fecha o arquiva
			gravador.close();
			System.out.println("Arquivo gravado com sucesso!");

		} catch (IOException e) {
			System.out.println("Erro durante gravação do arquivo:\n " + arquivo);
			e.printStackTrace();
		}

	}

	static public void ler(String arquivo) {
		try {
			FileReader leitor = new FileReader(arquivo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha;
			while ((linha = buffer.readLine()) != null) {
				System.out.println(linha);
			}
			buffer.close();
			leitor.close();

		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado para leitura:\n " + arquivo);
			e.printStackTrace();
		}

		catch (IOException e) {
			System.out.println("Erro durante leitura do arquivo:\n " + arquivo);
			e.printStackTrace();
		}

	}
}

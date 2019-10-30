package br.com.carlos.produto.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.carlos.produto.model.Venda;
import br.com.carlos.produto.repository.VendeRepository;

@RestController("/relatorio")
public class RelatorioController {

	

	@Autowired
	private VendeRepository vender;
	
	@GetMapping
	public List<Venda> relatorio() {
		
		/**
		 * Para chamar esse método é o caminho http://localhost:8080/loja/relatorio
		 */
		
		
		List<Venda> vendasList = vender.findAll();

		
		
		escreverArquivoDisco(vendasList);
		
		lerArquivoDisco();
		
		return vendasList;

	}

	private void lerArquivoDisco() {
		//TODO Carlos ler o mesmo arquivo aqui e escrever no system.out.println cada linha
		//dica é utilizar o FileReader e
		BufferedReader br = new BufferedReader(null);
		
		
	}

	private void escreverArquivoDisco(List<Venda> vendasList) {
		File arquivoSaida = new File("/home/ney/Documentos/desenvolvimento/projetos/estudo_carlos/arquivo1.csv");
		
		if(!arquivoSaida.exists()) {
			try {
				arquivoSaida.createNewFile();
				FileWriter fw = new FileWriter(arquivoSaida);
				BufferedWriter bw = new BufferedWriter(fw);
				
				for (Venda v : vendasList) {
					System.out.println(v);
					
					bw.write(v.toString());
					bw.newLine();
				}
				
				bw.flush();
				bw.close();
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}

			
		}
	}
	
}
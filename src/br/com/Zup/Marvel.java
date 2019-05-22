package br.com.Zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Marvel {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		List< String > listaDepersonagens = new ArrayList< String >();

		String nomePersonagem = "";


				while ( !nomePersonagem.equalsIgnoreCase(" Homem de ferro")) {
					System.out.println(" Digite o nome do personagem: ");

					nomePersonagem = scan.nextLine();

					listaDepersonagens.add(nomePersonagem);


					System.out.println(" O personagem adicionado a lista foi: " + nomePersonagem);



				}
				
				System.out.println("Os personagens da lista são: " + listaDepersonagens);
				
				for( String string : listaDepersonagens) {

					System.out.println(string);

					scan.close();
				}
	}
}

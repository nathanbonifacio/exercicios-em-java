/*
Nathan Henrique Paiva Bonifacio
 */

import java.util.Scanner;
public class QuestaoOito {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int duracao;
		System.out.print("Digite o horario do inicio do jogo: ");
		int inicio = scanner.nextInt();
		System.out.print("Digite o horario do fim do jogo: ");
		int fim = scanner.nextInt();
		
		if(inicio < fim)
		{
			duracao = fim - inicio;
		}
		else
		{
			duracao = inicio + fim;
		}
		
		if(duracao > 24)
		{
			System.out.println("A partida nao pode passar de 24 horas");
		}
		
		System.out.println("Duracao do jogo: " + duracao + " hora(s)");
	}
}


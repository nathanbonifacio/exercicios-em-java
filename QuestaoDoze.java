/*
Nathan Henrique Paiva Bonifacio
 */

import java.util.Scanner;
public class QuestaoDoze {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double total;
		System.out.print("Informe o preço do produto: ");
		double preco = scanner.nextDouble();
		System.out.print("Informe o codigo do produto: ");
		int id = scanner.nextInt();
		
		if(id == 1)
		{
			System.out.println();
			System.out.println("Preco do produto: " + preco);
			System.out.println("Regiao de procedencia: Norte");
			System.out.println("Valor do frete: 10%");
			total = preco + (0.10 * preco);
			System.out.println("Valor final da compra: " + total);
		}
		else if(id == 2 || id == 5 || id == 9)
		{
			System.out.println();
			System.out.println("Preco do produto: " + preco);
			System.out.println("Regiao de procedencia: Sul");
			System.out.println("Valor do frete: 3%");
			total = preco + (0.03 * preco);
			System.out.println("Valor final da compra: " + total);
		}
		else if(id == 3 || id >=10 && id <=15)
		{
			System.out.println();
			System.out.println("Preco do produto: " + preco);
			System.out.println("Regiao de procedencia: Leste");
			System.out.println("Valor do frete: 1,2%");
			total = preco + (0.012 * preco);
			System.out.println("Valor final da compra: " + total);
		}
		else if(id == 7 || id == 20)
		{
			System.out.println();
			System.out.println("Preco do produto: " + preco);
			System.out.println("Regiao de procedencia: Oeste");
			System.out.println("Valor do frete: 7,3%");
			total = preco + (0.073 * preco);
			System.out.println("Valor final da compra: " + total);
		}
		else
		{
			System.out.println();
			System.out.println("Preco do produto: " + preco);
			System.out.println("Regiao de procedencia: Importado");
			System.out.println("Valor do frete: 22,2%");
			total = preco + (0.222 * preco);
			System.out.println("Valor final da compra: " + total);
		}
	}
}


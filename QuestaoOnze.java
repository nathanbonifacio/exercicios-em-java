/*
Nathan Henrique Paiva Bonifacio
 */

import java.util.Scanner;
public class QuestaoOnze {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double conta;
		System.out.print("Primeiro numero: ");
		int n1 = scanner.nextInt();
		System.out.print("Segundo numero: ");
		int n2 = scanner.nextInt();
		System.out.println("---------");
		System.out.println("Escolha uma das opçoes: ");
		System.out.println("+");
		System.out.println("-");
		System.out.println("*");
		System.out.println("/");
		System.out.println();
		String op = scanner.next();
		
		switch (op)
		{
			case "+" :
				System.out.println("--------");
				System.out.println("Opcao escolhida: +");
				conta = n1 + n2;
				System.out.println("Resultado: " + conta);
			break;
			case "-":
				System.out.println("--------");
				System.out.println("Opcao escolhida: -");
				conta = n1 - n2;
				System.out.println("Resultado: " + conta);
			break;
			case "*":
				System.out.println("--------");
				System.out.println("Opcao escolhida: *");
				conta = n1 * n2;
				System.out.println("Resultado: " + conta);
			break;
			case "/":
				System.out.println("--------");
				System.out.println("Opcao escolhida: /");
				conta = n1 / n2;
				System.out.println("Resultado: " + conta);
			break;
			default:
				System.out.println("--------");
				System.out.println("Opcap invalida");
				break;
		}
	}
}


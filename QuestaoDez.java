/*
Nathan Henrique Paiva Bonifacio
 */

import java.util.Scanner;
public class QuestaoDez {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe seu salario: ");
		double salarioFixo = scanner.nextDouble();
		System.out.print("Informe o valor das vendas efetuadas: ");
		double vendas = scanner.nextDouble();
		double total;
		if(vendas <= 1500)
		{
			total = (0.03 * vendas) + salarioFixo;
			System.out.println(total);
		}
		else
		{
			total = (0.05 * vendas) + salarioFixo;
			System.out.println(total);
		}
	}
}


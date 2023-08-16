/*
Nathan Henrique Paiva Bonifacio
 */

import java.util.Scanner;
public class QuestaoNove {
	
	public static void main (String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Informe o valor recebido por hora: ");
			double valorHora = scanner.nextDouble();
			System.out.print("Informe a quantidade de horas trabalhadas no mes: ");
			int horas = scanner.nextInt();
			double valorTotal = valorHora * horas;
			double salarioAcrescimo = (50/100) * valorTotal;
			double salarioTotalAcresc = valorTotal + salarioAcrescimo;
			if(horas > 40)
			{
				System.out.println("R$" + salarioTotalAcresc);			
			}	
			else
			{
				System.out.println("R$" + valorTotal);
			}
	}
}


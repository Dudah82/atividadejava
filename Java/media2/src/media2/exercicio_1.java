package media2;

import java.util.Scanner;

public class exercicio_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Média do Aluno");
		System.out.print("Digite o nome do aluno");
		String nome = scan.nextLine();
		System.out.print("Digite a primeira nota");
		int n1 = scan.nextInt();
		System.out.print("Digite a sugunda nota");
		int n2 = scan.nextInt();
		System.out.print("Digite a terceira nota");
		int n3 = scan.nextInt();
		
		double res = (n1 + n2 + n3) / 3;
		
		System.out.print("O aluno "+nome+ "recebeu a media"+res);
	}
}

	
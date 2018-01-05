package br.com.SomaNotas.Classe;

import java.util.Scanner;

public class NotasMedia {

	private static Scanner dado;

	public static void main(String[] args) {

		int n1, n2, n3, n4;
		dado = new Scanner(System.in);

		System.out.print("Digite a A nota n1");
		n1 = dado.nextInt();
		System.out.print("Digite a A nota n2");
		n2 = dado.nextInt();
		System.out.print("Digite a A nota n3");
		n3 = dado.nextInt();
		System.out.print("Digite a A nota n4");
		n4 = dado.nextInt();

		int media;

		media = (n1 + n2 + n3 + n4) / 4;

		System.out.println("A media do aluno foi: " + media);
	}

}

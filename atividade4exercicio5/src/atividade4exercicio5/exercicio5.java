package atividade4exercicio5;

import java.util.Scanner;

public class exercicio5 {
	
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int num, soma = 0;

		do {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			if(num > 0) {
				soma = soma + num;
			}
			} while(num != 0);

		System.out.println("O resultado da soma dos números positivos é: " + soma);

	}

}


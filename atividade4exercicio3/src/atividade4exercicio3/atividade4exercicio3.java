package atividade4exercicio3;

import java.util.Scanner;

public class exercicio3 {
 
	    public static void main(String[] args) {
	        Scanner leia = new Scanner(System.in);
	        int menores21 = 0;
	        int maiores50 = 0;
	        boolean idadeNegativa = false;

	        System.out.println("Digite a idade: ");
	        int idade = leia.nextInt();

	        if(idade < 0){
	            System.out.println("");
	        }else {
	            while (!idadeNegativa) {
	                if (idade < 21) {
	                    menores21++;
	                } else if (idade > 50) {
	                    maiores50++;
	                }

	                System.out.println("Digite a idade: ");
	                idade = leia.nextInt();

	                if (idade < 0) {
	                    idadeNegativa = true;
	                }
	            }
	        }
	        System.out.println("Total de pessoas menores de 21 anos: " + menores21);
	        System.out.println("Total de pessoas maiores de 50 anos: " + maiores50);


	    }
	}



package atividade4exercicio1;

import java.util.Scanner;

public class exercicio1 {

	
	    public static void main(String[] args) {
	        Scanner leia = new Scanner(System.in);
	        System.out.println("Digite o 1º número:");

	        int numero1 = leia.nextInt();;
	        System.out.println("Digite o último número:");
	        int numero2 = leia.nextInt();;

	        if (numero1 > numero2){
	            System.out.println ("Intervalo inválido!");
	        }else {
	            for (int i = numero1; i <= numero2; i++) {
	                if (i % 3 == 0 && i % 5 == 0) {
	                    System.out.println(i + " é multiplo de 3 e 5");
	                }
	            }
	        }
	    }
}

package atividade4exercicio2;

import java.util.Scanner;

public class exercicio2for {

public static void main (String[] args ) {
	
		Scanner leia = new Scanner (System.in);

		String num;
		int contador;
		
		for(contador = 1; contador <=10; contador++) {
			System.out.println("\nDigite o " + contador + "º número: ");
	num = leia.nextLine();
	
		int numero, contPar = 0, contImpar = 1;

	            
	            if(numero % 2 == 0){
	                contPar++;
	            }

	            if(numero % 2 == 1){
	                contImpar++;
	            }           
	        }
	        
	        System.out.println("Foram digitados " + contPar + " números pares");
	        System.out.println (" e " + contImpar + " números ímpares");
	        
	    }

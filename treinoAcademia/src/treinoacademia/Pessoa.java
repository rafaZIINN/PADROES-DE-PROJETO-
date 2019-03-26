/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treinoacademia;

import java.util.Scanner;

/**
 *
 * @author marcos
 */
public class Pessoa {

    public static void main (String[] args){
		Scanner ler = new Scanner(System.in);
		
		ExercicioFactory exercicios = new ExercicioFactory();
		Exercicio exercicio = null;

		System.out.println("Qual exercicio você realizou ?");
		if(ler.hasNextLine()){
			String tipo = ler.nextLine();
			exercicio = exercicios.fazerExercicio(tipo);
		}

		if(exercicio != null){
			executar(exercicio);
		} else System.out.println("Digite o nome corretamente");
	}

	public static void executar(Exercicio exercicio){
		exercicio.abrir();
	}	
}

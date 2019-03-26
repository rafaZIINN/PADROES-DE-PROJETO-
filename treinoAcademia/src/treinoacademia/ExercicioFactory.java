/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treinoacademia;

/**
 *
 * @author marcos
 */
public class ExercicioFactory {
    
    public Exercicio fazerExercicio(String tipo){		
		if(tipo.equals("abdominal")){
			return new Abdominal();
		}else if(tipo.equals("agachamento")){
			return new Agachamento();
		}else if(tipo.equals("supino")){
                    return new Supino();
                }else if(tipo.equals("flay")){
                    return new Flay();
                }else return null;
	}
}

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
public abstract class Exercicio {
    
    private String nome;

	public String getName(){
		return nome;
	}

	public void setName(String nome){
		this.nome = nome;
	}
	
	public void abrir(){
		System.out.println("Você realizou o exercicio de "+getName());
	}
    
}

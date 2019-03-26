/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author Rafael
 */
public class Prototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    AcerProtatype acer= new AcerProtatype();
    
    SamsungProtatype samsung= new SamsungProtatype();
 
    NotbookProtatype acerNovo = acer.clonar();
    acerNovo.setValorCompra(2500.0);
    
    NotbookProtatype acerUsado = acer.clonar();
    acerUsado.setValorCompra(1500.0);
 
    System.out.println(acerNovo.exibirInfo());
    System.out.println(acerUsado.exibirInfo());
    
    System.out.println("#################################");
    
    NotbookProtatype samsungNovo = samsung.clonar();
    samsungNovo.setValorCompra(2200.0);
    
    NotbookProtatype samsungUsado = samsung.clonar();
    samsungUsado.setValorCompra(1200.0);
 
    System.out.println(samsungNovo.exibirInfo());
    System.out.println(samsungUsado.exibirInfo());
    
    
}
    
   
 
   
    
}
    
    


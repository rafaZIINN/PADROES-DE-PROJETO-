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
public abstract  class NotbookProtatype {
    protected double valoCompra;
    
    public abstract String exibirInfo();
    
    public abstract NotbookProtatype clonar();
    
    public double getValorCompra(){
        return valoCompra;
    }
    
    public void setValorCompra(double valorCompra){
        this.valoCompra = valorCompra;
    }
}

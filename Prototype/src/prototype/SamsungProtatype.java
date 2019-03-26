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
public class SamsungProtatype extends NotbookProtatype{
    protected SamsungProtatype (SamsungProtatype samsungProtatype){
        this.valoCompra = samsungProtatype.getValorCompra();
    }
    
    public SamsungProtatype(){
        valoCompra = 0.0;
    }
    
    @Override
    public String exibirInfo() {
        return "Marca: Samsung\nLinha: Expert\n" + "Valor: R$"
                + getValorCompra();
    }
    
     @Override
    public NotbookProtatype clonar() {
        return new SamsungProtatype(this);
    }
}

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
public class AcerProtatype extends NotbookProtatype {
    protected AcerProtatype (AcerProtatype acerProtatype){
        this.valoCompra = acerProtatype.getValorCompra();
    }
    
    public AcerProtatype(){
        valoCompra = 0.0;
    }
    
    @Override
    public String exibirInfo() {
        return "Marca: Acer\nLinha: Aspire 5\n" + "Valor: R$"
                + getValorCompra();
    }
    
     @Override
    public NotbookProtatype clonar() {
        return new AcerProtatype(this);
    }
    
}

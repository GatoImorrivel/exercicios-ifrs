package ex9;


/**
 * Escreva uma descrição da classe TesteProduto aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class TesteProduto
{
    private Produto produtoTeste;
    public TesteProduto() {
        this.produtoTeste = new Produto(200, "Teste");
    }
    
    public void testar() {
        this.produtoTeste.print();
        this.produtoTeste.setDescontoMax(10).setParcelasMax(12);
        
        System.out.println("------------------------------");
        
        this.produtoTeste.print();
    }
    
    public void testarCustom(double desconto, int parcelas) {
        this.produtoTeste.print();
        this.produtoTeste.setDescontoMax(desconto).setParcelasMax(parcelas);
        
        System.out.println("------------------------------");
        
        this.produtoTeste.print();
    }
}

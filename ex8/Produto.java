package ex8;


/**
 * Escreva uma descrição da classe Produto aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Produto
{
    private double descontoMax;
    private int parcelaMax;
    
    private double preco;
    private String nome;
    
    public Produto(double preco, String nome) {
        this.descontoMax = 20;
        this.parcelaMax = 24;
        
        if(nome.length() < 2) {
            System.out.println("Nome muito curto, usando valor padrao");
            this.nome = "produto generico";
        } else {
            this.nome = nome;
        }
        
        if(preco < 0.01) {
            System.out.println("Preco muito pequeno, usando valor padrao");
            this.preco = 10;
        } else {
            this.preco = preco;
        }
    }

    public void setDescontoMax(double desconto) {
        if(desconto > 20 || desconto < 0) {
            System.out.println("Desconto invalido");
            return;
        }
        
        this.descontoMax = desconto;
    }
    
    public void setParcelasMax(int parcelaMax) {
        if(parcelaMax > 24 || parcelaMax < 1) {
            System.out.println("Numero de parcelas invalido");
            return;
        }
        
        this.parcelaMax = parcelaMax;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        if(nome.length() < 2) {
            System.out.println("Novo nome muito curto");
            return;
        }
        
        this.nome = nome;
    }
    
    public double getPreco() {
        return this.preco;
    }
    
    public void setPreco(double preco) {
        if(preco < 0.01) {
            System.out.println("Preco muito pequeno");
            return;
        }
        
        this.preco = preco;
    }
}

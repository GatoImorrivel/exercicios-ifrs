package ex9;


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

    public Produto setDescontoMax(double desconto) {
        if(desconto > 20 || desconto < 0) {
            System.out.println("Desconto invalido");
            return this;
        }
        
        this.descontoMax = desconto;
        return this;
    }
    
    public Produto setParcelasMax(int parcelaMax) {
        if(parcelaMax > 24 || parcelaMax < 1) {
            System.out.println("Numero de parcelas invalido");
            return this;
        }
        
        this.parcelaMax = parcelaMax;
        return this;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public Produto setNome(String nome) {
        if(nome.length() < 2) {
            System.out.println("Novo nome muito curto");
            return this;
        }
        
        this.nome = nome;
        return this;
    }
    
    public double getPreco() {
        return this.preco;
    }
    
    public Produto setPreco(double preco) {
        if(preco < 0.01) {
            System.out.println("Preco muito pequeno");
            return this;
        }
        
        this.preco = preco;
        return this;
    }
    
    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preco: " + this.preco);
        System.out.println("Parcelas maximas: " + this.parcelaMax);
        System.out.println("Desconto maximo: " + this.descontoMax);
    }
}

package ex10;


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

    public void descontoMax(double desconto) {
        if(desconto > 20 || desconto < 0) {
            System.out.println("Desconto invalido");
            return;
        }
        
        this.descontoMax = desconto;
    }
    
    public double descontoMax() {
        return this.descontoMax;
    }
    
    public void parcelaMax(int parcelaMax) {
        if(parcelaMax > 24 || parcelaMax < 1) {
            System.out.println("Numero de parcelas invalido");
            return;
        }
        
        this.parcelaMax = parcelaMax;
    }
    
    public double parcelaMax() {
        return this.parcelaMax;
    }
    
    public String nome() {
        return this.nome;
    }
    
    public void nome(String nome) {
        if(nome.length() < 2) {
            System.out.println("Novo nome muito curto");
            return;
        }
        
        this.nome = nome;
    }
    
    public double preco() {
        return this.preco;
    }
    
    public void preco(double preco) {
        if(preco < 0.01) {
            System.out.println("Preco muito pequeno");
            return;
        }
        
        this.preco = preco;
    }
    
    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preco: " + this.preco);
        System.out.println("Parcelas maximas: " + this.parcelaMax);
        System.out.println("Desconto maximo: " + this.descontoMax);
    }
}

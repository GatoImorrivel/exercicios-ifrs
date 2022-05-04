package ex3;

public class CarroCorrida {
   private int numeroCarro;
   private String piloto;
   private String equipe;
   private double velocidadeMaxima;
   private double velocidadeAtual;
   private boolean ligado;
   
    public CarroCorrida(int numeroCarro, String piloto, String equipe, double velocidadeMaxima) {
        this.numeroCarro = numeroCarro;
        this.piloto = piloto;
        this.equipe = equipe;
        this.velocidadeMaxima = velocidadeMaxima;
        
        if(velocidadeMaxima <= 0) {
            System.out.println("Velocidade maxima invalida");
            this.velocidadeMaxima = 0;
        }
    }

    public void acelerar(double quantidade) {
        if(this.ligado == false) {
            System.out.println("Carro está desligado, nao posso acelerar");
            return;
        }

        if(this.velocidadeAtual + quantidade > this.velocidadeMaxima) {
            this.velocidadeAtual = this.velocidadeMaxima;
            return;
        }

        this.velocidadeAtual += quantidade;
    }

    public void frear(double porcentagem) {
        if(this.ligado == false) {
            System.out.println("Carro está desligado, nao posso frear");
            return;
        }

        if(porcentagem > 100) {
            System.out.println("Porcentagem maior que o limite");
            return;
        }

        this.velocidadeAtual -= (this.velocidadeAtual * porcentagem) / 100;
    }

    public void parar() {
        this.velocidadeAtual = 0;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        if(this.ligado == true && this.velocidadeAtual == 0) {
            this.ligado = false;
            System.out.println("Carro " + numeroCarro + " foi desligado");
            return;
        }

        System.out.println("Carro ainda esta ligado");
    }

    public int getNumeroCarro() {
        return this.numeroCarro;
    }

    public void setNumeroCarro(int numero) {
        this.numeroCarro = numero;
    }

    public String getPiloto() {
        return this.piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public String getEquipe() {
        return this.equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public double getVelocidadeMaxima() {
        return this.velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadeAtual() {
        return this.velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public boolean getLigado() {
        return this.ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}

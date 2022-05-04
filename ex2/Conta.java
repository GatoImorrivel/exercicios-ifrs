package ex2;

public class Conta {
    double balance = 0;

    public Conta(double balance) {
        this.balance = balance;
        
        if(balance < 0) {
            System.out.println("Invalid balance");
            this.balance = 0;
        }
    }

    public Conta() {
        this.balance = 1000;
    }
    
    public void sacar(double quantidade) {
        this.balance -= quantidade;
    }
    
    public void depositar(double quantidade) {
        this.balance += quantidade;
    }
}
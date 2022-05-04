package ex4;

public class Lampada {
    private boolean acessa;

    public Lampada(boolean acessa) {
        this.acessa = acessa;
    }

    public void printEstado() {
        if(this.acessa) {
            System.out.println("Esta lampada esta acessa!");
        } else {
            System.out.println("Lampada esta apagada");
        }
    }

    public void interruptor() {
        this.acessa = !acessa;
        this.printEstado();
    }
}

package ex5;

public class Lampada {
    private boolean acessa;
    private double watts;

    public Lampada(boolean acessa, double watts) {
        this.acessa = acessa;
        if(watts < 1) {
            System.out.println("Numero invalido de watts");
            this.watts = 1;
            return;
        }
        this.watts = watts;
    }

    public Lampada() {
        this.acessa = false;
        this.watts = 60;
    }

    public void printEstado() {
        if (this.acessa) {
            System.out.println("Esta lampada esta acessa!");
        } else {
            System.out.println("Lampada esta apagada");
        }

        System.out.println("Essa lampada tem " + this.watts + " watts");
    }

    public void interruptor() {
        this.acessa = !acessa;
        this.printEstado();
    }
}

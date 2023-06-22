package Animal;

public class Peixe extends Animal{

    private int barbatanas;
    private int cauda;

    public Peixe(String nome, double comprimento, int numPatas, String cor, String ambiente,
                 double velocidade, int barbatanas, int cauda) {
        super(nome, comprimento, numPatas, cor, ambiente, velocidade);
        this.barbatanas = barbatanas;
        this.cauda = cauda;
    }

    @Override
    public String toString() {
        return "Peixe{ " + super.toString() +
                " barbatanas=" + barbatanas +
                ", cauda=" + cauda +
                '}';
    }
}

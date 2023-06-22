package exercicio1e2;

public class ContaCorrente extends ContaBancaria implements Tributos{

    public ContaCorrente(String nomeCliente, int numeroConta, double saldo) {
        super(nomeCliente, numeroConta, saldo);
    }

    @Override
    public double calcularTributos() {
        double tributos = getSaldo()*0.01;
        setSaldo(getSaldo()-tributos);
        System.out.println("novo saldo: "+ getSaldo());
        return tributos;
    }
}

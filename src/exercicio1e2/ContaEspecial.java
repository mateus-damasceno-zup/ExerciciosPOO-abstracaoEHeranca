package exercicio1e2;

public class ContaEspecial extends ContaBancaria implements Tributos{

    private double limite;


    public ContaEspecial(String nomeCliente, int numeroConta, double saldo, double limite) {
        super(nomeCliente, numeroConta, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public double sacar(double valor) {
        double saldo = getSaldo();
        if (getSaldo()<= 0|| getSaldo()<valor || valor > limite){
            System.out.println("saldo insuficiente, ou limite excedido, voce possui "+ getSaldo()+" com limite de "+getLimite());
        return saldo;
        }
        return saldo - valor;


    }

    @Override
    public String toString() {
        return super.toString()+ ", limite=" + limite + '}';
    }

    @Override
    public double calcularTributos() {
        double tributos = getSaldo()*0.01;
        setSaldo(getSaldo()-tributos);
        System.out.println("novo saldo: "+ getSaldo());
       return tributos;


    }
}

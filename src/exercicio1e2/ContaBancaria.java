package exercicio1e2;

public abstract class ContaBancaria {

    private String nomeCliente;
    private int numeroConta;
    private double saldo;

    public ContaBancaria(String nomeCliente, int numeroConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public double sacar(double valor) {
        if (getSaldo()<= 0|| getSaldo()<valor){
            System.out.println("saldo insuficiente, voce possui "+ getSaldo());
        }else{
            setSaldo(getSaldo()-valor);
        }
        return valor;
    }


    public void depositar(double valor) {
        setSaldo(getSaldo()+valor);
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", numeroConta=" + numeroConta +
                ", saldo=" + saldo ;
    }
}

package exercicio1e2;

public class ContaPoupanca extends ContaBancaria{

    private double taxaDiaRendimento;

    public ContaPoupanca(String nomeCliente, int numeroConta, double saldo, double taxaDiaRendimento) {
        super(nomeCliente, numeroConta, saldo);
        this.taxaDiaRendimento = taxaDiaRendimento;
    }

    public double getTaxaDiaRendimento() {
        return taxaDiaRendimento;
    }

    public void setTaxaDiaRendimento(double taxaDiaRendimento) {
        this.taxaDiaRendimento = taxaDiaRendimento;
    }

    void calcularNovoSaldo(){
        setSaldo(getSaldo()*(1+(getTaxaDiaRendimento()/100)));
  }
    @Override
    public String toString() {
        return super.toString() + ", taxaDiaRendimento: "+taxaDiaRendimento+"%}";

    }
}

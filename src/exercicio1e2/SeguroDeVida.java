package exercicio1e2;

public class SeguroDeVida extends ContaBancaria implements Tributos{

    private double taxaSeguro;

    public SeguroDeVida(String nomeCliente, int numeroConta, double saldo, double taxaSeguro) {
        super(nomeCliente, numeroConta, saldo);
        this.taxaSeguro = taxaSeguro;
    }

    public double getTaxaSeguro() {
        return taxaSeguro;
    }

    public void setTaxaSeguro(double taxaSeguro) {
        this.taxaSeguro = taxaSeguro;
    }

    @Override
    public double calcularTributos() {
        setTaxaSeguro(42);
        double taxaSeguro = getSaldo()-getTaxaSeguro();
        setSaldo(getSaldo()-getTaxaSeguro());
        System.out.println("tributos do seguro de vida: "+getTaxaSeguro()+" novo saldo: "+ getSaldo());
        return getTaxaSeguro();
    }

    @Override
    public String toString() {
        return super.toString() + " taxaSeguro: "+taxaSeguro+"}";
    }
}

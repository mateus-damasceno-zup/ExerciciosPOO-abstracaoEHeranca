package exercicio1e2;

public class BancoMain {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente("Mateus",1,400000);

        System.out.println(cc.getSaldo());
        cc.sacar(1000);
        cc.depositar(5000);
        cc.sacar(1000000);
        System.out.println(cc.getSaldo());

        ContaEspecial ce = new ContaEspecial("Karla",2,50000,1000);

        System.out.println(ce.getSaldo());
        ce.sacar(2000);
        ce.sacar(900);
        ce.depositar(5000);
        System.out.println(ce.getSaldo());

        ContaPoupanca cp = new ContaPoupanca("Kiwi",3,1000000,10);
        System.out.println(cp.getSaldo());
        cp.calcularNovoSaldo();
        System.out.println(cp.getSaldo());
        cp.sacar(1000);
        cp.depositar(22222);


        SeguroDeVida sv = new SeguroDeVida("Jujuba",4,5000,42);

        sv.calcularTributos();
        sv.getSaldo();
        System.out.println(cc);
        System.out.println(ce);
        System.out.println(cp);
        System.out.println(sv);
    }
}

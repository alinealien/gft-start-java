package one.digitalinnovation.bancodigital;

public class Main {
    public static void main(String[] args) {
        Cliente aline = new Cliente();
        aline.setNome("Aline");

        Conta cc = new ContaCorrente(aline);
        ContaPoupanca pp = new ContaPoupanca(aline);

        cc.depositar(100);
        cc.transferir(100, pp);

        cc.imprimirExtrato();
        pp.imprimirExtrato();

    }
}
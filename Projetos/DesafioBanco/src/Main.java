public class Main {
    public static void main(String[] args) {
        Cliente teste = new Cliente();
        teste.setNome("Teste1");

        Conta cc = new ContaCorrente(teste);
        Conta cp = new ContaPoupanca(teste);

        cc.depositar(100);
        cc.transferir( cp,100);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}

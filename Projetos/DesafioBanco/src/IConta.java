public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(Conta contaDestilo, double valor);

    void imprimirExtrato();
}

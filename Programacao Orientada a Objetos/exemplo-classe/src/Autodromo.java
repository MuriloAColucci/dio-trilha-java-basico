public class Autodromo {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setChassi("897897");
        carro.ligar();

        Moto moto = new Moto();
        moto.setChassi("467744");
        moto.ligar();
    }
}

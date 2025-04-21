public class ComputadorPedrinho {
    public static void main(String[] args) {
        System.out.println("MSN");
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("FACEBOOK");
        FacebookMessenger fcb = new FacebookMessenger();
        fcb.enviarMensagem();
        fcb.receberMensagem();

        System.out.println("TELEGRAM");
        TelegramMessenger tlg = new TelegramMessenger();
        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}

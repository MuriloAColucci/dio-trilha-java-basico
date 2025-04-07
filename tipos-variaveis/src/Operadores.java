public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM " + "JAVA";

        System.out.println(nomeCompleto);

        int numero = 5;
        numero++;

        boolean variavel = true;
        variavel = !variavel;

        int a = 5, b = 6;

        String resultado = a==b ? "Verdadeiro" : "Falso";
        System.out.println(resultado);

        String nomeUm = "MURILO";
        String nomeDois = new String("MURILO");
        System.out.println(nomeUm.equals(nomeDois));

        boolean condicao1 = true, condicao2 = false;

        if(condicao1 && (7 > 4))
            System.out.println("As duas condições são verdadeiras");
    }
}

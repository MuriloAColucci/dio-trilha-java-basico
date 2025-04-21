public enum EstadoBrasileiro {
    SAO_PAULO ("SP", "São Paulo", 11),
    RIO_DE_JANEIRO ("RJ", "Rio de Janeiro", 12),
    PIAUI ("PI", "Piauí", 13),
    MARANHAO ("MA", "Maranhão", 14),
    CEARA ("CE", "Ceará", 15);

    private String nome;
    private String sigla;
    private int ibje;

    private EstadoBrasileiro(String sigla, String nome, int ibje){
        this.sigla = sigla;
        this.nome = nome;
        this.ibje = ibje;
    }

    public String getSigla(){
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public int getIbje() {
        return ibje;
    }

    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }
}

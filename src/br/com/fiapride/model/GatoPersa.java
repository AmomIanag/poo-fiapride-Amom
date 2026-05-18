package br.com.fiapride.model;

public class GatoPersa extends Gato {

    private String comprimentoPelo;

    // Construtor
    public GatoPersa(String nome, Tutor tutor, String comprimentoPelo) {
        super(nome, tutor);
        this.comprimentoPelo = comprimentoPelo;
    }

    // Getter e Setter
    public String getComprimentoPelo() {
        return comprimentoPelo;
    }

    public void setComprimentoPelo(String comprimentoPelo) {
        this.comprimentoPelo = comprimentoPelo;
    }
}
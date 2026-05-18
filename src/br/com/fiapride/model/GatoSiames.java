package br.com.fiapride.model;

public class GatoSiames extends Gato {

    private String corOlhos;

    // Construtor
    public GatoSiames(String nome, Tutor tutor, String corOlhos) {
        super(nome, tutor);
        this.corOlhos = corOlhos;
    }

    // Getter e Setter
    public String getCorOlhos() {
        return corOlhos;
    }

    public void setCorOlhos(String corOlhos) {
        this.corOlhos = corOlhos;
    }
}
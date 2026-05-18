package br.com.fiapride.model;

public class GatoSiames extends Gato implements Brincavel {

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

    // POLIMORFISMO
    @Override
    public String emitirSom() {
        return "MIAAAAU!";
    }
    // INTERFACE
    @Override
    public void brincar() {
        System.out.println(getNome() + " está correndo pela casa!");
    }

    @Override
    public String brinquedoFavorito() {
        return "Laser";
    }
}
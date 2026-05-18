package br.com.fiapride.model;

public class GatoPersa extends Gato implements Brincavel {

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

    // POLIMORFISMO
    @Override
    public String emitirSom() {
        return "Miauu suave!";
    }
    // INTERFACE
    @Override
    public void brincar() {
        System.out.println(getNome() + " está brincando calmamente com almofadas.");
    }

    @Override
    public String brinquedoFavorito() {
        return "Bolinha de lã";
    }
}
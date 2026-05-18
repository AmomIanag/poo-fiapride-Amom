package br.com.fiapride.model;

public class Gato {

    // Atributos privados
    private String nome;
    private String cor;
    private double tamanho;
    private double peso;

    // CONSTRUTOR
    public Gato(String nome) {
        this.setNome(nome);
    }

    // GETS E SETS

    public String getNome() {
        return nome;
    }

    // Regra para o nome
    public void setNome(String nome) {

        if (nome == null || nome.isEmpty()) {
            System.out.println("O gato precisa ter um nome!");
        } else {
            this.nome = nome;
        }
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getPeso() {
        return peso;
    }

    // REGRA ESPECIAL
    public void setPeso(double peso) {

        if (peso <= 0) {
            System.out.println("Peso inválido! O gato não pode ter peso negativo ou zero.");
        } else {
            this.peso = peso;
        }
    }

    // Método para o gato comer
    public void comer(double quantidadeComida) {

        if (quantidadeComida <= 0) {
            System.out.println("Quantidade de comida negativa! (alimenta esse gato)");
        } else {
            peso += quantidadeComida;
            System.out.println(nome + " comeu e agora pesa: " + peso + " kg");
        }
    }

    // Método para o gato crescer
    public void crescer(double crescimento) {

        if (crescimento <= 0) {
            System.out.println("O gato não teve crescimento");
        } else {
            tamanho += crescimento;
            System.out.println(nome + " cresceu e agora mede: " + tamanho + " cm");
        }
    }
}
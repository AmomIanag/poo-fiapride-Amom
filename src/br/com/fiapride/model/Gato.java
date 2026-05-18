package br.com.fiapride.model;
<<<<<<< HEAD

public class Gato {

    public String cor;
    public double tamanho;
    public double peso;


    // Método para o gato comer
    public void comer(double quantidadeComida) {

        // Regra de negócio
        if (quantidadeComida <= 0) {
            System.out.println("Quantidade de comida negativa! (alimenta esse gato)");
        } else {
            peso += quantidadeComida;
            System.out.println("O gato comeu e agora pesa: " + peso + " kg");
        }
    }

    // Método para o gato crescer
    public void crescer(double crescimento) {

        // Regra de negócio
        if (crescimento <= 0) {
            System.out.println("O gato não teve crescimento");
        } else {
            tamanho += crescimento;
            System.out.println("O gato cresceu e agora mede: " + tamanho + " cm");
        }
    }
=======
public class Gato { // <-- Use o nome do SEU objeto    
    // As características que você pensou    
    public String cor;
    public float peso;
    public float tamanho;
    
>>>>>>> dfa228c83fc4a3acd4d8a14c052a5355ce32cc3c
}
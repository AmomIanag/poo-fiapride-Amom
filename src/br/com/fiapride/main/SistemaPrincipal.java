package br.com.fiapride.main;

import br.com.fiapride.model.Gato;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Gato gato1 = new Gato("Garfield");

        gato1.setCor("Laranja");
        gato1.setTamanho(20);
        gato1.setPeso(5);

        Gato gato2 = new Gato("Theo");

        gato2.setCor("Cinza");
        gato2.setTamanho(100);
        gato2.setPeso(6);

        // Teste da regra
        gato2.setPeso(-10);

        System.out.println("--- Sistema FiapRide ---");

        System.out.println("\n--- Meu Gato ---");
        System.out.println("Nome: " + gato1.getNome());
        System.out.println("Cor: " + gato1.getCor());
        System.out.println("Tamanho inicial: " + gato1.getTamanho() + " cm");
        System.out.println("Peso inicial: " + gato1.getPeso() + " kg");

        System.out.println("\n--- Gato do Meu Amigo ---");
        System.out.println("Nome: " + gato2.getNome());
        System.out.println("Cor: " + gato2.getCor());
        System.out.println("Tamanho inicial: " + gato2.getTamanho() + " cm");
        System.out.println("Peso inicial: " + gato2.getPeso() + " kg");

        // Evolução gato 1
        System.out.println("\n--- Evolução do Meu Gato ---");

        gato1.comer(1.5);
        gato1.crescer(3);

        System.out.println("Peso atual: " + gato1.getPeso() + " kg");
        System.out.println("Tamanho atual: " + gato1.getTamanho() + " cm");

        // Evolução gato 2
        System.out.println("\n--- Evolução do Gato do Meu Amigo ---");

        gato2.comer(-1);
        gato2.crescer(3);

        System.out.println("Peso atual: " + gato2.getPeso() + " kg");
        System.out.println("Tamanho atual: " + gato2.getTamanho() + " cm");
    }
}
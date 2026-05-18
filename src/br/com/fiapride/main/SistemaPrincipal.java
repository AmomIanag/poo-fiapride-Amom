package br.com.fiapride.main;

import br.com.fiapride.model.Gato;
import br.com.fiapride.model.GatoPersa;
import br.com.fiapride.model.GatoSiames;
import br.com.fiapride.model.Tutor;

import java.util.ArrayList;
import java.util.List;

public class SistemaPrincipal {

    public static void main(String[] args) {

        // Criando tutores
        Tutor tutor1 = new Tutor("Amom");
        Tutor tutor2 = new Tutor("Aurea");

        // Criando gatos
        GatoPersa gato1 = new GatoPersa("Garfield", tutor1, "Longo");

        gato1.setCor("Laranja");
        gato1.setTamanho(18);
        gato1.setPeso(5);

        GatoSiames gato2 = new GatoSiames("Luna", tutor2, "Azul");

        gato2.setCor("Cinza");
        gato2.setTamanho(20);
        gato2.setPeso(6);

        // Teste da regra
        gato2.setPeso(-10);

        System.out.println("--- Sistema FiapRide ---");

        System.out.println("\n--- Meu Gato ---");
        System.out.println("Nome: " + gato1.getNome());
        System.out.println("Tutor: " + gato1.getTutor().getNome());
        System.out.println("Tipo de pelo: " + gato1.getComprimentoPelo());
        System.out.println("Cor: " + gato1.getCor());

        System.out.println("\n--- Gato da Minha Namorada ---");
        System.out.println("Nome: " + gato2.getNome());
        System.out.println("Tutor: " + gato2.getTutor().getNome());
        System.out.println("Cor dos olhos: " + gato2.getCorOlhos());
        System.out.println("Cor: " + gato2.getCor());

        // Evolução gato 1
        System.out.println("\n--- Evolução do Meu Gato ---");

        gato1.comer(1.5);
        gato1.crescer(3);

        System.out.println("Peso atual: " + gato1.getPeso() + " kg");
        System.out.println("Tamanho atual: " + gato1.getTamanho() + " cm");

        // Evolução gato 2
        System.out.println("\n--- Evolução do Gato da Minha Namorada ---");

        gato2.comer(-1);
        gato2.crescer(3);

        System.out.println("Peso atual: " + gato2.getPeso() + " kg");
        System.out.println("Tamanho atual: " + gato2.getTamanho() + " cm");
        // POLIMORFISMO
        System.out.println("\n--- Sons dos Gatos ---");

        List<Gato> gatos = new ArrayList<>();

        gatos.add(gato1);
        gatos.add(gato2);

        for (Gato gato : gatos) {
            System.out.println(gato.getNome() + ": " + gato.emitirSom());
        }
    }
}
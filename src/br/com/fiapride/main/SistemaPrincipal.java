package br.com.fiapride.main;

<<<<<<< HEAD
=======
// Importamos a classe Passageiro para que o sistema a reconheça
>>>>>>> dfa228c83fc4a3acd4d8a14c052a5355ce32cc3c
import br.com.fiapride.model.Gato;

public class SistemaPrincipal {

    public static void main(String[] args) {
<<<<<<< HEAD

        Gato gato1 = new Gato();
        gato1.cor = "Laranja";
        gato1.tamanho = 20; // cm
        gato1.peso = 5; // kg

        Gato gato2 = new Gato();
        gato2.cor = "Cinza";
        gato2.tamanho = 100; // cm
        gato2.peso = 6; // kg

        // Exibindo os dados iniciais
        System.out.println("--- Sistema FiapRide ---");

        System.out.println("\n ---Meu Gato--- ");
        System.out.println("Cor: " + gato1.cor);
        System.out.println("Tamanho inicial: " + gato1.tamanho + " cm");
        System.out.println("Peso inicial: " + gato1.peso + " kg");

        System.out.println("\n ---Gato do Meu Amigo--- ");
        System.out.println("Cor: " + gato2.cor);
        System.out.println("Tamanho inicial: " + gato2.tamanho + " cm");
        System.out.println("Peso inicial: " + gato2.peso + " kg");

        // evulucao gato 1
        System.out.println("\n ---Evolução do Meu Gato--- ");

        gato1.comer(1.5);
        gato1.crescer(3);

        System.out.println("Peso atual: " + gato1.peso + " kg");
        System.out.println("Tamanho atual: " + gato1.tamanho + " cm");

        // evolucao gato 2
        System.out.println("\n ---Evolução do Gato do Meu Amigo--- ");

        gato2.comer(-1);
        gato2.crescer(3);

        System.out.println("Peso atual: " + gato2.peso + " kg");
        System.out.println("Tamanho atual: " + gato2.tamanho + " cm");

=======
        // INSTANCIAÇÃO
        // O comando 'new' aloca memória para um novo objeto.
        // Criando o primeiro passageiro (Objeto 1)
        Gato gato1 = new Gato();
        gato1.cor = "Laranja";
        gato1.tamanho = 20; //cm
        gato1.peso = 5; //kg

        // Criando o segundo passageiro (Objeto 2)
        Gato gato2 = new Gato();
        gato2.cor = "Cinza";
        gato2.tamanho = 100; //cm
        gato2.peso = 6; //kg

        // Exibindo os dados no Console
        System.out.println("--- Sistema FiapRide ---");
        System.out.println("Meu gato é: " + gato1.cor);
        System.out.println("O gato do meu amigo é: " + gato2.cor);
        
        // Teste mental: Se eu mudar o nome do passageiro1, o passageiro2 muda?
>>>>>>> dfa228c83fc4a3acd4d8a14c052a5355ce32cc3c
    }
}
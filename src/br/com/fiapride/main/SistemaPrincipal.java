package br.com.fiapride.main;

// Importamos a classe Passageiro para que o sistema a reconheça
import br.com.fiapride.model.Gato;

public class SistemaPrincipal {

    public static void main(String[] args) {
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
    }
}
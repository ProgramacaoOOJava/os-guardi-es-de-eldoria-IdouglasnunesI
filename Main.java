import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Criação da lista de personagens
        ArrayList<Personagem> personagens = new ArrayList<>();

        // Instanciando objetos
        personagens.add(new Guerreiro(
                "Arthus",
                10,
                150,
                25.5,
                "Espada Longa"));

        personagens.add(new Mago(
                "Elenara",
                12,
                90,
                40.8,
                "Fogo"));

        // Percorre todos os personagens
        for (Personagem personagem : personagens) {

            personagem.exibirStatus();

            personagem.usarHabilidadeEspecial();

            System.out.println("----------------------------------");
        }

    }

}

public class Main {

    public static void main(String[] args) {

        Grupo grupo1 = new Grupo();
        Grupo grupo2 = new Grupo();

        Guerreiro guerreiro = new Guerreiro(
                "Arthus",
                10,
                150,
                30,
                "Espada Longa");

        Mago mago = new Mago(
                "Elenara",
                12,
                90,
                25,
                "Fogo");

        Guerreiro guerreiro2 = new Guerreiro(
                "Leon",
                8,
                120,
                20,
                "Machado");

        Mago mago2 = new Mago(
                "Merlin",
                15,
                80,
                22,
                "Raio");

        grupo1.adicionarPersonagem(guerreiro);
        grupo1.adicionarPersonagem(mago);

        grupo2.adicionarPersonagem(guerreiro2);
        grupo2.adicionarPersonagem(mago2);

        System.out.println("=== Grupo 1 ===");
        grupo1.listarPersonagens();

        System.out.println();

        System.out.println("=== Grupo 2 ===");
        grupo2.listarPersonagens();

        grupo1.batalhar(guerreiro, guerreiro2);

        grupo1.batalhar(mago, mago2);

    }
}

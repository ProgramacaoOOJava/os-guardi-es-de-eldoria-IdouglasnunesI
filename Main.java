public class Main {

    public static void main(String[] args) {

        // Criação do primeiro personagem
        Personagem personagem1 = new Personagem();

        personagem1.nome = "Arthemis";
        personagem1.classe = "Arqueira";
        personagem1.nivel = 5;
        personagem1.pontosDeVida = 80;
        personagem1.poderBase = 12.5;

        // Criação do segundo personagem
        Personagem personagem2 = new Personagem();

        personagem2.nome = "Kael";
        personagem2.classe = "Guerreiro";
        personagem2.nivel = 8;
        personagem2.pontosDeVida = 120;
        personagem2.poderBase = 18.7;

        // Exibe as informações dos personagens
        personagem1.exibirStatus();
        personagem2.exibirStatus();
    }
}

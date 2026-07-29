public class Personagem {

    // Atributos do personagem
    String nome;
    String classe;
    int nivel;
    int pontosDeVida;
    double poderBase;

    // Método para exibir as informações do personagem
    void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Nível: " + nivel);
        System.out.println("Pontos de Vida: " + pontosDeVida);
        System.out.println("Poder Base: " + poderBase);
        System.out.println("---------------------------");
    }
}

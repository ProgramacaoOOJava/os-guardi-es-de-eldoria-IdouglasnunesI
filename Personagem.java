public abstract class Personagem {

    protected String nome;
    protected String classe;
    protected int nivel;
    protected int pontosDeVida;
    protected double poderBase;

    // Construtor da superclasse
    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }

    // Método comum para todas as subclasses
    public void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Nível: " + nivel);
        System.out.println("Pontos de Vida: " + pontosDeVida);
        System.out.println("Poder Base: " + poderBase);
    }

    // Método abstrato que será implementado nas subclasses
    public abstract void usarHabilidadeEspecial();
}

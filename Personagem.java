// Classe abstrata que representa um personagem do jogo
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

// Classe Guerreiro herda de Personagem
public class Guerreiro extends Personagem {

    private String arma;

    // Construtor
    public Guerreiro(String nome, int nivel, int pontosDeVida, double poderBase, String arma) {

        super(nome, "Guerreiro", nivel, pontosDeVida, poderBase);
        this.arma = arma;
    }

    // Sobrescrita do método abstrato
    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("Guerreiro " + nome + " ataca com Espada Flamejante usando sua " + arma + "!");
    }
}

// Classe Mago herda de Personagem
public class Mago extends Personagem {

    private String elemento;

    // Construtor
    public Mago(String nome, int nivel, int pontosDeVida, double poderBase, String elemento) {

        super(nome, "Mago", nivel, pontosDeVida, poderBase);
        this.elemento = elemento;
    }

    // Sobrescrita do método abstrato
    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("Mago " + nome + " lança Bola de Fogo utilizando magia de " + elemento + "!");
    }
}




// Classe abstrata que representa um personagem
public abstract class Personagem {

    protected String nome;
    protected String classe;
    protected int nivel;
    protected int pontosDeVida;
    protected double poderBase;

    public Personagem(String nome, String classe, int nivel,
                      int pontosDeVida, double poderBase) {

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

    // Método abstrato
    public abstract void usarHabilidadeEspecial();

    // Getters
    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public int getNivel() {
        return nivel;
    }

    public double getPoderBase() {
        return poderBase;
    }
}

public class Guerreiro extends Personagem {

    private String arma;

    public Guerreiro(String nome, int nivel, int pontosDeVida,
                     double poderBase, String arma) {

        super(nome, "Guerreiro", nivel, pontosDeVida, poderBase);
        this.arma = arma;
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("Guerreiro " + nome +
                " ataca com Espada Flamejante usando " + arma + "!");
    }
}

public class Mago extends Personagem {

    private String elemento;

    public Mago(String nome, int nivel, int pontosDeVida,
                double poderBase, String elemento) {

        super(nome, "Mago", nivel, pontosDeVida, poderBase);
        this.elemento = elemento;
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("Mago " + nome +
                " lança Bola de Fogo usando magia de " + elemento + "!");
    }
}
import java.util.ArrayList;

// Classe responsável por armazenar os personagens
public class Grupo {

    private ArrayList<Personagem> membros;

    public Grupo() {
        membros = new ArrayList<>();
    }

    // Adiciona personagem ao grupo
    public void adicionarPersonagem(Personagem p) {
        membros.add(p);
    }

    // Lista os personagens
    public void listarPersonagens() {

        for (Personagem p : membros) {
            p.exibirStatus();
            System.out.println("----------------------");
        }
    }

    // Método que realiza uma batalha
    public void batalhar(Personagem a, Personagem b) {

        double poderA = a.getNivel() * a.getPoderBase();
        double poderB = b.getNivel() * b.getPoderBase();

        System.out.println();
        System.out.println("===== BATALHA =====");
        System.out.println(a.getNome() + " -> Poder Total: " + poderA);
        System.out.println(b.getNome() + " -> Poder Total: " + poderB);

        if (poderA > poderB) {

            System.out.println(a.getClasse() + " "
                    + a.getNome()
                    + " venceu! Poder total: "
                    + poderA);

        } else if (poderB > poderA) {

            System.out.println(b.getClasse() + " "
                    + b.getNome()
                    + " venceu! Poder total: "
                    + poderB);

        } else {

            System.out.println("A batalha terminou empatada!");
        }

        System.out.println("=====================");
    }
}

























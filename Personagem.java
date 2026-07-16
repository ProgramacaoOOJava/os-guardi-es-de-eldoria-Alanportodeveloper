
public abstract class Personagem implements Comparable<Personagem> {
    //Declaração das variáveis de instância
    private String nome;
    private String classe;
    private int nivel;
    private int pontosDeVida;
    private double poderBase;

    //Construtor com as suas respectivos parâmetros
    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }

    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public double getPoderBase() {
        return poderBase;
    }

    //Método abstrato que deverá ser implementado pelas classes que herdar a classe
    public abstract void usarHabilidadeEspecial();

    //Método para imprimir as informções do personagem
    public void exibirStatus() {
        System.out.println("--- Status do Personagem ---");
        System.out.printf("Nome: %s%n", getNome());
        System.out.printf("Classe: %s%n", getClasse());
        System.out.printf("Nível: %d%n", getNivel());
        System.out.printf("Pontos de Vida: %d%n", getPontosDeVida());
        System.out.printf("Poder Base: %.2f%n%n", getPoderBase());

    }

    @Override
    public int compareTo(Personagem outroPersonagem) {
        return Integer.compare(this.nivel, outroPersonagem.nivel);

    }    

}



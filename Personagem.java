
public abstract class Personagem {
    //Declaração das variáveis de instância
    String nome;
    String classe;
    int nivel;
    int pontosDeVida;
    double poderBase;

//Construtor com as suas respectivos parâmetros
    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }

//Método abstrato que deverá ser implementado pelas classes que herdar a classe
    public abstract void usarHabilidadeEspecial();

//Método para imprimir as informções do personagem
    public void exibirStatus() {
        System.out.println("--- Status do Personagem ---");
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Classe: %s%n", classe);
        System.out.printf("Nível: %d%n", nivel);
        System.out.printf("Pontos de Vida: %d%n", pontosDeVida);
        System.out.printf("Poder Base: %.2f%n%n", poderBase);

    }
}


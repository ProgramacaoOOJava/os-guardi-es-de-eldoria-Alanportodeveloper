
public class Main {
    public static void main(String[] args) {

//Instanciação dos objetos e atibuição à uma variável
        Guerreiro guerreiro1 = new Guerreiro("Arthus", "Guerreiro", 1, 100, 10.5);
        Mago mago1 = new Mago("Elenara", "Maga", 5, 80, 12.5);

//Chamada do método para exibir o staus
        guerreiro1.exibirStatus();
        mago1.exibirStatus();

        guerreiro1.usarHabilidadeEspecial();
        mago1.usarHabilidadeEspecial();

    }
}

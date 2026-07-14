
public class Main {
    public static void main(String[] args) {

//Instanciação dos objetos e atibuição à uma variável
        Personagem heroi1 = new Personagem("Arthus", "Guerreiro", 1, 100, 10.5);
        Personagem heroi2 = new Personagem("Arthemis", "Arqueira", 5, 80, 12.5);

//Chamada do método para exibir o staus
        heroi1.exibirStatus();
        heroi2.exibirStatus();

    }
}


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//Instanciação dos objetos e atribuição à uma variável
        Guerreiro guerreiro1 = new Guerreiro("Arthus", "Guerreiro", 5, 150, 12.0, 8.0);
        Mago mago1 = new Mago("Elenara", "Maga", 7, 100, 15.0, 10.0);

//Chamada do método para exibir o staus
        guerreiro1.exibirStatus();
        mago1.exibirStatus();

//Chamada do método para usar a habilidade especial
        guerreiro1.usarHabilidadeEspecial();
        mago1.usarHabilidadeEspecial();


        System.out.print("\n\n--- Demostração de polimorfismo ---\n\n");

//Criando uma lista de personagens
        List<Personagem> herois = new ArrayList<>();

        //Adicionando personagens à lista
        herois.add(guerreiro1);
        herois.add(mago1);
        //Instanciando e atribuindo os valores de um personagem
        herois.add(new Guerreiro("Borrim", "Guerreiro", 3, 120, 10.0, 6.0));

//Itera na lista
        for (Personagem heroi : herois){
            heroi.exibirStatus();
            heroi.usarHabilidadeEspecial();
            System.out.println("--------------------------");
        }

    }
}

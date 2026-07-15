
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//Instanciação dos objetos e atibuição à uma variável
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
        herois.add(new Guerreiro("Borrim", "Guerreiro", 3, 120, 10.0, 6.0));


        for (Personagem p : herois){
            p.exibirStatus();
            p.usarHabilidadeEspecial();
            System.out.println("--------------------------");
        }

    }
}

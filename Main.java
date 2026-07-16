
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//Instanciação dos objetos e atribuição à uma variável
        Guerreiro arthus = new Guerreiro("Arthus", "Guerreiro", 5, 150, 12.0, 8.0);
        Mago elenara = new Mago("Elenara", "Maga", 7, 100, 15.0, 10.0);
        Guerreiro borim = new Guerreiro("Borim", "Guerreiro", 3, 120, 10.0, 6.0);
        Mago morgana = new Mago("Morgana", "Maga", 6, 90, 14.0, 9.0);

//Instanciando grupos e adicionando personagens a eles
        Grupo grupo1 = new Grupo("Os vingadores");
        grupo1.adicionarPersonagem(arthus);
        grupo1.adicionarPersonagem(elenara);

        Grupo grupo2 = new Grupo("Os magos");
        grupo2.adicionarPersonagem(borim);
        grupo2.adicionarPersonagem(morgana);

        //Listando os membros dos grupos
        grupo1.listarPersonagem();
        grupo2.listarPersonagem();


//Simulação de batalhas entre grupos
        


    }
}

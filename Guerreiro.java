public class Guerreiro extends Personagem {

public Guerreiro(String nome, String classe, int nivel, int vida, double ataque){
     super(nome, classe, nivel, vida, ataque);
}

@Override
public void usarHabilidadeEspecial(){

    System.out.println(classe + nome + " ataca com Espada Flamejante!");
}

}
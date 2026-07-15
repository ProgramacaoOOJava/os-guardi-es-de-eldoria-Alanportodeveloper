public class Mago extends Personagem {

public Mago(String nome, String classe, int nivel, int vida, double ataque){
     super(nome, classe, nivel, vida, ataque);
}


@Override
public void usarHabilidadeEspecial(){

System.println(classe + nome + " lança Bola de Fogo!");
    
}

}
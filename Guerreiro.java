public class Guerreiro extends Personagem {

double forca;

//Criação do construtor 
public Guerreiro(String nome, String classe, int nivel, int pontosDeVida, double poderBase, double forca){
     super(nome, classe, nivel, pontosDeVida, poderBase);
     this.forca = forca;
}

//Método sobreescrito para dar o comportamento especifico da classe Guerreiro, utilizando o polimorfismo
@Override
public void usarHabilidadeEspecial(){

    System.out.println(classe + " " + nome + " ataca com Espada Flamejante!");
}

}
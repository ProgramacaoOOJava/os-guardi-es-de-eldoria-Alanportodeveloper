public class Mago extends Personagem {

double inteligencia;

//Criação do construtor  
public Mago(String nome, String classe, int nivel, int pontosDeVida, double poderBase, double inteligencia){
     super(nome, classe, nivel, pontosDeVida, poderBase);
     this.inteligencia = inteligencia;
}

//Método sobreescrito para dar o comportamento especifico da classe Mago, utilizando o polimorfismo
@Override
public void usarHabilidadeEspecial(){

System.out.println(classe + " " + nome + " lança Bola de Fogo!");
    
}

}
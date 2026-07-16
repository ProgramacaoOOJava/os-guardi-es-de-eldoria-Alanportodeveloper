import java.util.List;
import java.util.ArrayList;

public class Grupo {

    private String nomeDoGrupo;
    private List<Personagem> membros;

    public Grupo(String nomeDoGrupo) {
        this.nomeDoGrupo = nomeDoGrupo;
        this.membros = new ArrayList<>();

    }

    public String getNomeDoGrupo() {
        return nomeDoGrupo;
    }

    public List<Personagem> getMembros() {
        return membros;
    }

    public void adicionarPersonagem(Personagem personagem){
        membros.add(personagem);
    }

    public void listarPersonagem(){
        System.out.println("\n--- Membros do Grupo: " + getNomeDoGrupo() + " ---");
        for(Personagem personagem : membros){
            personagem.exibirStatus();
        }

        System.out.println("---------------------------------------------------------");

    }

    public int batalhar(Personagem a, Personagem b){

        System.out.println("\n Inicio da batalha entre " + a.getNome() + " e " + b.getNome() + "!\n");  
        int resultado;

        System.out.println(a.getNome() + " Poder total: " + calcularPoderTotal(a));
        System.out.println(b.getNome() + " Poder total: " + calcularPoderTotal(b));  

        double poderTotal = calcularPoderTotal(a) - calcularPoderTotal(b);

        if(poderTotal > 0){
            System.out.println(a.getNome() + " venceu a batalha!");
            resultado = 1;
        } else if(poderTotal < 0){  
            System.out.println(b.getNome() + " venceu a batalha!");
            resultado = -1;
        } else {
            System.out.println("A batalha terminou em empate!");
            resultado = 0;
        }

        System.out.println("\nFim da batalha!");
        return resultado;
    }

    private double calcularPoderTotal(Personagem personagem){
        return personagem.getNivel() * personagem.getPoderBase();
    }

}
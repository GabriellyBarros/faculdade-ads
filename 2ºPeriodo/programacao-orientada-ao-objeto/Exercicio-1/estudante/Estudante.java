package estudante;

public class Estudante {
    //Declaração das variáveis
    public String nome, matricula, curso;
    public int idade;
    public double notaMedia;

    public Estudante(String nome, String matricula, String curso, int idade, double notaMedia){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.idade = idade;
        this.notaMedia = notaMedia;
    }

    //Método para registrar Nota
    public void registrarNota(double novaNota){
        this.notaMedia = novaNota;
    }

     //Método de aprovação
    public boolean verificaraprovacao(){
        return this.notaMedia >=7.0;
    }
    
}

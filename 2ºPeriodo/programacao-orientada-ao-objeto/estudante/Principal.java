package estudante;

public class Principal {
    public static void main(String[] args) {
        Estudante aluno1 = new Estudante("João Andrade", "2026012", "Psicologia", 20, 6.5);

        //Testando os dados e a aprovação inicial
        System.out.println("Aluno:" + aluno1.nome);
        System.out.println("Curso:" + aluno1.curso);
        System.out.println("Nota inicial:" + aluno1.notaMedia);
        System.out.println("Está aprovado?" + aluno1.verificaraprovacao());

        System.out.println("-------------------------------------------");

        //Registrando uma nova nota e checando a aprovação novamente
        aluno1.registrarNota(8.5);
        System.out.println("Nova nota registrada:" + aluno1.notaMedia);
        System.out.println("Está aprovado agora?" + aluno1.verificaraprovacao());
    }
    
}

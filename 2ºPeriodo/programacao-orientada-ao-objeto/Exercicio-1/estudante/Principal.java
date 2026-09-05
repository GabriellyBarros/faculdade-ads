package estudante;

public class Principal {
    public static void main(String[] args) {
        Estudante aluno1 = new Estudante("João Andrade", "2026012", "Psicologia", 20, 6.5);
        Estudante aluno2 = new Estudante("Maria Luísa", "2026013", "Direito", 22, 6.0);

        //Testando o aluno1
        System.out.println("==Estudante 1==");
        System.out.println("Aluno:" + aluno1.nome);
        System.out.println("Curso:" + aluno1.curso);
        System.out.println("Nota inicial:" + aluno1.notaMedia);
        System.out.println("Está aprovado?" + aluno1.verificarSituacao());

        System.out.println("-------------------------------------------");

        //Registrando uma nova nota e  testando aluno1
        aluno1.registrarNota(8.5);
        System.out.println("Nova nota registrada:" + aluno1.notaMedia);
        System.out.println("Está aprovado agora?" + aluno1.verificarSituacao());


         System.out.println("-------------------------------------------");

         //Testando o aluno2
        System.out.println("==Estudante 2==");
        System.out.println("Aluno:" + aluno2.nome);
        System.out.println("Curso:" + aluno2.curso);
        System.out.println("Nota inicial:" + aluno2.notaMedia);
        System.out.println("Está aprovado?" + aluno2.verificarSituacao());

         System.out.println("-------------------------------------------");

        //Registrando uma nova nota e  testando aluno2
        aluno2.registrarNota(9.5);
        System.out.println("Nova nota registrada:" + aluno2.notaMedia);
        System.out.println("Está aprovado agora?" + aluno2.verificarSituacao());
    }
    
}

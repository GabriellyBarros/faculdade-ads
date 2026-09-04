package funcionario;

public class Funcionario {
    // Declaração de variáveis 
    public String nome, cpf, cargo, departamento;//Agrupar todas as variáveis do tipo String.
    public double salarioMensal;

    public Funcionario(String nome, String cpf, String cargo, double salarioMensal, String departamento){
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salarioMensal = salarioMensal;
        this.departamento = departamento;
    }

    public void aplicarAumento(double percentual){
        salarioMensal += salarioMensal * (percentual / 100);
    }

    public double calcularSalarioAnual(){
        return salarioMensal * 12;
    }
  

    
}

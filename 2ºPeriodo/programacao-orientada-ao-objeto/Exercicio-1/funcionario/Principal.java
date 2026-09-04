package funcionario;

public class Principal {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Maria Silva", "123.456.789-00", "Professora", 5000.00, "Educação");

        //Testando o cálculo do salário anual
        double salarioAnual = func1.calcularSalarioAnual();
        System.out.println("Salário Anual: R$ " + salarioAnual);

        //Testando a aplicação de um aumento(Ex.: 10%)
        func1.aplicarAumento(10);
        System.out.println("Salário mensal atualizado após o aumento: R$" + func1.salarioMensal);
    }
    
}

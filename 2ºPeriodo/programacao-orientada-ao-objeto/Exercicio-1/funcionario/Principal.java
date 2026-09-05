package funcionario;

public class Principal {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Maria Silva", "123.456.789-00", "Professora", 5000.00, "Educação");
        Funcionario func2 = new Funcionario("Carlos Gomes", "987.654.321-11", "Coordenador Pedagógico", 3000.00, "Gestão Pedagógica");

        //Testando func1
        System.out.println("===Funcionario 1===");
        System.out.println("Nome: " + func1.nome);
        System.out.println("Cargo: " + func1.cargo);
        System.out.println("Salário Mensal Inicial: R$ " + func1.salarioMensal);
        System.out.println("Salário Anual Inicial: R$ " + func1.calcularSalarioAnual());

        //Aplicar 10% de aumento no func1
        func1.aplicarAumento(10);
        System.out.println("Após o aumento de 10% -> Novo Salário Mensal: R$ " + func1.salarioMensal);
        System.out.println("Novo Salário Anual: R$ " + func1.calcularSalarioAnual());

        System.out.println("--------------------------------------------------------------");

         //Testando func2
        System.out.println("===Funcionario 2===");
        System.out.println("Nome: " + func2.nome);
        System.out.println("Cargo: " + func2.cargo);
        System.out.println("Salário Mensal Inicial: R$ " + func2.salarioMensal);
        System.out.println("Salário Anual Inicial: R$ " + func2.calcularSalarioAnual());

        //Aplicar 10% de aumento no func2
        func2.aplicarAumento(10);
        System.out.println("Após o aumento de 10% -> Novo Salário Mensal: R$ " + func2.salarioMensal);
        System.out.println("Novo Salário Anual: R$ " + func2.calcularSalarioAnual());

    }
    
}


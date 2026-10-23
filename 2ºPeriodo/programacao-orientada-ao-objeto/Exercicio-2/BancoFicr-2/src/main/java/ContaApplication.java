import com.br.controller.ContaController;
import com.br.interfaces.InterfaceConta;
import com.br.model.conta.Conta;
import com.br.model.conta.ContaBeneficio;
import com.br.model.conta.ContaCorrente;
import com.br.repository.RepositoryConta;

import java.util.List;
import java.util.Scanner;

public class ContaApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        InterfaceConta contasRepo = new RepositoryConta();
        ContaController contaController = new ContaController();
        String continuar;
        int op;

        do{
            System.out.println("Menu de opções!");
            System.out.println("1. Cadastrar Conta");
            System.out.println("2. Buscar Conta");
            System.out.println("3. Editar Conta");
            System.out.println("4. Remover Conta");
            System.out.println("5. Listar Contas");
            System.out.println("6. Sair");

            System.out.print("Digite uma opção: ");
            op = input.nextInt();
            switch (op){
                case 1: contaController.cadastrarConta(contasRepo);
                break;
                case 5: contaController.listarContas(contasRepo);
                break;
                default:
                    System.out.println("Opção Inválida!");
            }
            System.out.print("Deseja contnuar?: ");
            continuar = input.next();
        } while (continuar.equals("sim"));
    }
}

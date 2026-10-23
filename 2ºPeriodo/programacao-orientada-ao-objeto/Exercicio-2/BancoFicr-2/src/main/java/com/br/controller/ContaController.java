package com.br.controller;

import com.br.interfaces.InterfaceConta;
import com.br.model.conta.Conta;
import com.br.model.conta.ContaCorrente;

import java.util.Scanner;

public class ContaController {
    Scanner input = new Scanner(System.in);
    Conta contaCorrente;

    public void cadastrarConta(InterfaceConta contaInterface){
        contaCorrente = new ContaCorrente();
        System.out.print("Digite o numero de conta: ");
        contaCorrente.setNumConta(input.next());
        System.out.print("Digite a agencia: ");
        contaCorrente.setAgencia(input.nextInt());
        contaCorrente.setSaldo(0.00);

        contaInterface.inserir(contaCorrente);
    }

    public void listarContas(InterfaceConta contaInterface){
        System.out.println("Contas: " + contaInterface.listarTodos());
    }
}

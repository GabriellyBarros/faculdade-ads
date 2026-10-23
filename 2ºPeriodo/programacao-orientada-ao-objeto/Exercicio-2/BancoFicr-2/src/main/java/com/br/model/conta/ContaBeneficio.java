package com.br.model.conta;

public class ContaBeneficio extends Conta {
    private double bonus;

    public ContaBeneficio(String numConta, int agencia, double saldo) {
        super(numConta, agencia, saldo);
    }

    @Override
    public void sacar(double valor){
        setSaldo(getSaldo() - valor);
    }
}

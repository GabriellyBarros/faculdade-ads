package com.br.model.conta;

public class ContaCorrente extends Conta {
    private double limiteConta;
    private final double TAXA_SAQUE = 0.50;

    public ContaCorrente(String numConta, int agencia,
                         double saldo, double limiteConta){
        super(numConta, agencia, saldo);
        this.limiteConta = limiteConta;
    }

    public ContaCorrente(String numConta, int agencia){
        super(numConta, agencia);
    }

    public ContaCorrente(){
        super();
    }

    public double getLimiteConta() {
        return limiteConta;
    }

    public void setLimiteConta(double limiteConta) {
        this.limiteConta = limiteConta;
    }

    @Override
    public void sacar(double valor){
        setSaldo(getSaldo()- (valor + TAXA_SAQUE));
    }
}

package com.br.model.conta;

public abstract class Conta {
    private String numConta;
    private int agencia;
    private double saldo;

    public Conta(String numConta, int agencia, double saldo){
        this.numConta = numConta;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public Conta(String numConta, int agencia){
        this.numConta = numConta;
        this.agencia = agencia;
    }

    public Conta(){
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public abstract void sacar(double valor);

    @Override
    public String toString(){
        return "Numero Conta: " + getNumConta() + " - Agencia: " +
                getAgencia() + " - Saldo: " + getSaldo();
    }
}

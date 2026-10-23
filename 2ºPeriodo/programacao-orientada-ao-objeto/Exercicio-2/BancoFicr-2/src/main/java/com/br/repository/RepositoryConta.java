package com.br.repository;

import com.br.interfaces.InterfaceConta;
import com.br.model.conta.Conta;

import java.util.ArrayList;
import java.util.List;

public class RepositoryConta implements InterfaceConta {
    List<Conta> contas = new ArrayList<Conta>();

    @Override
    public void inserir(Conta conta) {
        contas.add(conta);
    }

    @Override
    public Conta buscar(String numConta) {
        Conta contaProcurada = null;
        for (Conta c: contas){
            if (c.getNumConta().equals(numConta)){
                contaProcurada = c;
                break;
            }
        }
        return contaProcurada;
    }

    @Override
    public void editar(String numConta, Conta conta) {

    }

    @Override
    public void deletar(String numConta) {
        int posicao = -1;
        for (Conta c: contas){
            if (c.getNumConta().equals(numConta)){
                posicao = contas.indexOf(c);
            }
        }
        if (!contas.isEmpty()){
            contas.remove(posicao);
        }
    }

    @Override
    public List<Conta> listarTodos() {
        return this.contas;
    }
}

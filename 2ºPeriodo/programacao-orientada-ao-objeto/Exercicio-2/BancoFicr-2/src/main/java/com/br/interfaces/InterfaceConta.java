package com.br.interfaces;

import com.br.model.conta.Conta;

import java.util.List;

public interface InterfaceConta {
    void inserir(Conta conta);
    Conta buscar(String numConta);
    void editar(String numConta, Conta conta);
    void deletar(String numConta);
    List<Conta> listarTodos();
}

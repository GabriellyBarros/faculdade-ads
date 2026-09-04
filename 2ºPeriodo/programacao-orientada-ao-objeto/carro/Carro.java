package carro;

public class Carro {
    String cor;
    String marca;
    String modelo;
    int ano;
    int velocidadeAtual = 0;
    double TAXA_IMPOSTO = 0.05;
    double combustivel;

    public void acelerar(){
        velocidadeAtual += 10;
    }

    public void freiar(){
        velocidadeAtual -= 5;
    }

}

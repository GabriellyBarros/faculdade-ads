package carro;

public class Principal {
    public static void main (String[] args){
        //Criando um objeto fusca
        Carro meuCarro = new Carro();
        meuCarro.marca = "wolskwagw";
        meuCarro.modelo = "fusca";
        meuCarro.cor = "branco";
        meuCarro.ano = 1965;
        meuCarro.TAXA_IMPOSTO = 0.05;

        meuCarro.acelerar();
        meuCarro.freiar();

        //Criando um objeto ferrari
        Carro carroDoVizinho = new Carro();
        carroDoVizinho.marca = "ferrari";
        carroDoVizinho.modelo = "XTA-2026";
        carroDoVizinho.cor = "vermelho";
        carroDoVizinho.ano = 2026;

        carroDoVizinho.acelerar();
        carroDoVizinho.acelerar();
        carroDoVizinho.acelerar();
        carroDoVizinho.freiar();
        

    }
    
}

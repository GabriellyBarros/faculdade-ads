package televisor;

public class Televisor {
    //Declaração das variáveis
    public String marca;
    public int polegadas, volume, canalAtual;
    public boolean ligada;

    public Televisor(String marca, int polegadas, int volume, int canalAtual, boolean ligada){
        this.marca = marca;
        this.polegadas = polegadas;
        this.volume = volume;
        this.canalAtual = canalAtual;
        this.ligada = ligada;
    }

    //Método1 : ligar() - muda a variável 'ligada' para true
    public void ligar(){
        this.ligada = true;
    }

    //Método2 : trocarCanal(novoCanal)-atualiza 'canalAtual'
    public void trocarCanal(int novoCanal){
        this.canalAtual = novoCanal;
    }
    
}


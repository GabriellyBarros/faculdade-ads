package televisor;

public class Principal {
    public static void main(String[] args) {
        Televisor tv1 = new Televisor("Samsung", 55, 15, 2, false);
        Televisor tv2 = new Televisor("LG", 42, 10, 12, true);


     //Testando o primeiro Objeto tv1
     System.out.println("Marca TV1:" + tv1.marca);
     System.out.println("Canal inicial TV1:" + tv1.canalAtual);
     System.out.println("Está ligada?" + tv1.ligada);

     //Chamada de dois métodos na tv1
     tv1.ligar();
     tv1.trocarCanal(9);

     //Exibindo novos valores da tv1
     System.out.println("Após ligar -> Está ligada?" + tv1.ligada);
     System.out.println("Após trocar canal -> Novo canal TV1:" + tv1.canalAtual);

     System.out.println("--------------------------------------------------------");

     //Testando o primeiro Objeto tv2
     System.out.println("Marca TV2:" + tv2.marca);
     System.out.println("Canal inicial TV2:" + tv2.canalAtual);
     System.out.println("Está ligada?" + tv2.ligada);

     //Chamada de dois métodos na tv2
     tv2.trocarCanal(3);
     System.out.println("Após trocar canal -> Novo canal tv2:" + tv2.canalAtual);

    }

}


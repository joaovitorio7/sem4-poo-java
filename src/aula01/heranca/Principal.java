package aula01.heranca;

public class Principal {

    public static void main(String[] args) {

        Zebra zebra = new Zebra();
        int qtd = zebra.qtdDeListras;
        zebra.emitirSom();
       zebra.nome = "Marvin";
       zebra.caminhar();

       // polimorfismo
       Animal animal = new Zebra();
       animal.emitirSom();

       animal = new Cachorro();
       animal.emitirSom();
    }
}

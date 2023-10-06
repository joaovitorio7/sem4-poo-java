package aula01.heranca;

public class Cachorro extends Mamifero{

    String corDoPelo;

    @Override
    public void emitirSom() {

        qtdMamas = 10;
        super.nome = "Cachorrinha";

        System.out.println("Latir");
    }
}

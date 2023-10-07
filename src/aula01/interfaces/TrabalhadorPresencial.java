package aula01.interfaces;

public class TrabalhadorPresencial implements Trabalhador{

    @Override
    public void baterPonto(){
        System.out.println("Bate o ponto via viometria");
    }
}

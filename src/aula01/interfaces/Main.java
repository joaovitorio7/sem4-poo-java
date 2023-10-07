package aula01.interfaces;

public class Main {
    public static void main(String[] args) {
        TrabalhadorHomeOffice trabalhadorHomeOffice = new TrabalhadorHomeOffice();
        trabalhadorHomeOffice.baterPonto();

        TrabalhadorPresencial trabalhadorPresencial = new TrabalhadorPresencial();
        trabalhadorPresencial.baterPonto();

        EstagiarioHomeOffice estagiarioHomeOffice = new EstagiarioHomeOffice();
        estagiarioHomeOffice.baterPonto();

        Trabalhador presencial = new TrabalhadorPresencial();
        presencial.baterPonto();
    }
}

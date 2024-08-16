import tabuleiro.*;


public class Main {
    public static void main(String[] args) {
        Mov1 frente =new Mov1();
        Mov2 ladoD = new Mov2();
        Mov3 perdepeca =new Mov3();
        Mov4 ladoE =new Mov4();
        Mov5 tras =new Mov5();
        Mov6 elimina =new Mov6();
        Mov7 vitoria =new Mov7();

        peça peca = new peça();
        peca.setDirecao(frente);
        peca.mover();

        peca.setDirecao(ladoE);
        peca.mover();

        peca.setDirecao(perdepeca);
        peca.mover();

        peca.setDirecao(tras);
        peca.mover();

        peca.setDirecao(ladoD);
        peca.mover();

        peca.setDirecao(elimina);
        peca.mover();

        peca.setDirecao(vitoria);
        peca.mover();










    }
}
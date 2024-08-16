package tabuleiro;

public class peça {
    private Movimento direcao;

    public void setDirecao(Movimento direcao) {
        this.direcao = direcao;
    }
    public void mover(){
        direcao.mover();
    }
}

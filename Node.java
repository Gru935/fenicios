public class Node {
    private int posAtual;
    private int norte;
    private int leste;
    private int sul;
    private int oeste;
    
    public Node(int posAtual, int norte, int leste, int sul, int oeste) {
        this.posAtual = posAtual;
        this.norte = norte;
        this.leste = leste;
        this.sul = sul;
        this.oeste = oeste;
    }

    public int getPosAtual() {
        return posAtual;
    }

    public int getNorte() {
        return norte;
    }

    public int getLeste() {
        return leste;
    }

    public int getSul() {
        return sul;
    }

    public int getOeste() {
        return oeste;
    }

    public void setPosAtual(int posAtual) {
        this.posAtual = posAtual;
    }

    public void setNorte(int norte) {
        this.norte = norte;
    }

    public void setLeste(int leste) {
        this.leste = leste;
    }

    public void setSul(int sul) {
        this.sul = sul;
    }

    public void setOeste(int oeste) {
        this.oeste = oeste;
    }
}

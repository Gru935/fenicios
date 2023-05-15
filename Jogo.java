// import java.util.ArrayList;

public class Jogo {
    public void jogo(String[][] m){
        Node barco;
        int x = 0;
        int y = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if(m[i][j] == "1"){
                    x = i;
                    y = j;
                }
            }
        }
    }
}

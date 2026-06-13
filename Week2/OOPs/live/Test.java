package live;
import music.playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {

    public static void main(String[] args) {

        
        Veena vee = new Veena();
        vee.play();

        
        Saxophone saxo = new Saxophone();
        saxo.play();
        playable p;

        p = new Veena();
        p.play();

        p = new Saxophone();
        p.play();
    }
}
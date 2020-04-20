package live;
import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
    public static void main(String args[]){
        Veena v = new Veena();
        Saxophone s = new Saxophone();
        Playable ob1 = new Veena();
        Playable ob2 = new Saxophone();
        v.play();
        s.play();
        ob1.play();
        ob2.play();
    }
    
}

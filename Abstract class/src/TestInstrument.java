abstract class Instrument{
    abstract void play();
}

class Piano extends Instrument{  
    @Override
    void play(){
        System.out.println("Piano is playing  tan tan tan tan");
    }
}

class Flute extends Instrument{
    @Override
    void play(){
        System.out.println("Flute is playing  toot toot toot toot");
    }
}

class Guitar extends Instrument{
    @Override
    void play(){
        System.out.println("Guitar is playing  tin  tin  tin");
    }
}

public class TestInstrument {
    public static void main(String args[]){
        Instrument arr[] = new Instrument[10];
        arr[0] = new Piano();
        arr[1] = new Flute();
        arr[2] = new Guitar();
        arr[3] = new Piano();
        arr[4] = new Flute();
        arr[5] = new Guitar();
        arr[6] = new Piano();
        arr[7] = new Flute();
        arr[8] = new Guitar();
        arr[9] = new Piano();
        for(int i=0;i<arr.length;i++){
            if(arr[i] instanceof Piano){
                System.out.println("Object Piano at index : "+i);
                arr[i].play();
            }
            if(arr[i] instanceof Flute){
                System.out.println("Object Flute at index : "+i);
                arr[i].play();
            }
            if(arr[i] instanceof Guitar){
                System.out.println("Object Guitar at index : "+i);
                arr[i].play();
            }
        }
    }
}

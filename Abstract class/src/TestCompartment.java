import java.util.*;

abstract class compartment{
    abstract String notice();
}

class FirstClass extends compartment{
    @Override
    String notice(){
        return "First Class Compartment";
    }
}

class Ladies extends compartment{
    @Override
    String notice(){
        return "Ladies Class Compartment";
    }
}

class General extends compartment{
    @Override
    String notice(){
        return "General Class Compartment";
    }
}

class Luggage extends compartment{
    @Override
    String notice(){
        return "Luggage Class Compartment";
    }
}

public class TestCompartment {
    public static void main(String args[]){
        compartment arr[] = new compartment[10];
        
        Random r = new Random();
        for(int i=0;i<10;i++){
            int temp = r.nextInt(4)+1;
            if(temp==1){
                arr[i] = new FirstClass();
                System.out.println(arr[i].notice());
            }
            else if(temp==2){
                arr[i] = new Ladies();
                System.out.println(arr[i].notice());
            }
            else if(temp==3){
                arr[i] = new General();
                System.out.println(arr[i].notice());
            }
            else if(temp==4){
                arr[i] = new Luggage();
                System.out.println(arr[i].notice());
            }
        }
        
    } 
}

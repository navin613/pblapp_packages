import com.automobile.twowheeler.*;

public class testVehicle {
    public static void main(String args[]){
        Hero h1 = new Hero("A","HERO","HERO1",56);
        Honda h2 = new Honda("B","HONDA","HONDA1",65);
        
        System.out.println("Accessing Hero Class");
        System.out.println(h1.getModelName());
        System.out.println(h1.getRegistrationNumber());
        System.out.println(h1.getOwnerName());
        System.out.println(h1.getSpeed());
        h1.radio();
        
        System.out.println("Accessing Honda Class");
        System.out.println(h2.getModelName());
        System.out.println(h2.getRegistrationNumber());
        System.out.println(h2.getOwnerName());
        System.out.println(h2.getSpeed());
        h2.cdplayer();
    }
    
}

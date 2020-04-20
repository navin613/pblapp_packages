import com.automobile.FourWheeler.*;

public class testFourWheeler {
    public static void main(String args[]){
        Logan l = new Logan("A","LOGAN","LOGAN1",56);
        Ford f = new Ford("B","FORD","FORD1",65);
        
        System.out.println("Accessing Logan Class");
        System.out.println(l.getModelName());
        System.out.println(l.getRegistrationNumber());
        System.out.println(l.getOwnerName());
        System.out.println(l.getSpeed());
        l.gps();
        
        System.out.println("Accessing Ford Class");
        System.out.println(f.getModelName());
        System.out.println(f.getRegistrationNumber());
        System.out.println(f.getOwnerName());
        System.out.println(f.getSpeed());
        f.tempControl();
    }
    
}

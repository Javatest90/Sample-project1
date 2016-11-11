package helclient;

import hello.Hello;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HelClient {
    public static void main(String[] args) {
        try{
         Registry myReg=LocateRegistry.getRegistry("127.0.0.1", 1099);
         Hello c= (Hello)myReg.lookup("mycalc");
         
         System.out.println("the output is "+ c.sayHello());
        }
        
        catch(Exception ex){
            ex.printStackTrace();
        }
        
        
        
        
    }
    
}

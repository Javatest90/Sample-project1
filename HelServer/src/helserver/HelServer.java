package helserver;

import helloimplementation.HelloImplementation;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HelServer {

     public static String s;
    public static void main(String[] args) {
       try{
        Registry reg=LocateRegistry.createRegistry(1099); 
       
        HelloImplementation h=new HelloImplementation(s);
        reg.rebind("mycalc", h);
        
        System.out.println("server is ready....");
       }
     catch(Exception ex){
          ex.printStackTrace();
       }    
   
        
    }
   
    
    
    
    
    
    
}

package helloimplementation;

import hello.Hello;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImplementation extends UnicastRemoteObject implements Hello {

    private String name;
   

    public HelloImplementation() throws RemoteException {
        super();
     
    }
    
 public String sayHello() throws RemoteException {
return "Hello World!";
}
    
  
    
}

package serializationbytes;

import java.io.Serializable;

public class Users implements Serializable {
    String name ;
    String password;
    public  void  sayHello(){
        System.out.println("hello " + name);
    }
}

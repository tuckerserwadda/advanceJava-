package deserializationbytes;

import java.io.Serializable;

public class User implements Serializable {
    String name ;
    String password;

    public  String  sayHello(){
        return "go";
    }
}

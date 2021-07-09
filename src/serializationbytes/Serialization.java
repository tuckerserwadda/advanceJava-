package serializationbytes;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * notes ana procedures of serialization
 * what is serialization - the process of converting an object into a byte stream.
 * saves the state of the of the object after the program exits
 * the byte stream can be saved as a file(.ser) or sent over a network or can be sent  to a different machine
 *
 * procedure
 * 1. create a class object
 * 2. the object class should implement serializable interface
 * 3. add and import java.io serializable
 * 4.  FileOutputStream fileOut = new FileOutStream(file path)
 * 5. ObjectOutputStream out = new ObjectOutputStream(fileOut)
 * 6. out.writeObject(objectName)
 * 7. out.close();
 * 8. fileOut.close();
 */

public class Serialization {
    public static  void main(String [] args){

        Users user = new Users();
        user.name = "tucker";
        user.password = " @04";
        user.sayHello();
        // start serialization
        try {
            FileOutputStream fileOut = new FileOutputStream(
                    "C:\\Users\\xFact\\IdeaProjects\\advanceJavaTechinics\\src\\serialization\\serial.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(user);
            out.close();
            fileOut.close();
            System.out.println("file  serialized");

        }catch(Exception ex){
            System.out.println("file not save");
        }

        Users user2 = new Users();
        user2.name = "amosi";
        user2. password = "@jane";


    }
}

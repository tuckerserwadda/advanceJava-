package deserialization;

import javax.management.ObjectName;
import java.io.FileInputStream;

import java.io.ObjectInputStream;

/**
 * it the opposite of serialization
 * note
 * declare the object but do not instantiate
 */
public class Deserialization {
    public  static void main(String [] args){

        try {
            User user = null ;
            FileInputStream fileIn = new FileInputStream(
                    "serial.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            user = (User) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("object deserialized");
        }catch(Exception ex){
            System.out.println("file not found");
        }

    }
}

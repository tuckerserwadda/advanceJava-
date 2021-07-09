package inputOutFilesApi;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWrite {
    public static void main(String [] args){
        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("C:\\Users\\xFact\\IdeaProjects\\advanceJavaTechinics\\src\\inputOutFilesApi\\outPut.txt"));
            bw.write("Tucker is my name\n");
            bw.write("Serwadda is my last name");
            bw.close();

        }catch(Exception ex){
            System.out.println("something went wrong ");

        }

    }
}

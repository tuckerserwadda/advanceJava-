package inputOutFilesApi;


import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * reading from the file and making a coppy of ir
 */

public class BufferedR {

    public static void main(String [] args){
        try {
            java.io.BufferedReader br = new BufferedReader(
                    new FileReader("C:\\Users\\xFact\\IdeaProjects\\advanceJavaTechinics\\src\\inputOutFilesApi\\outPut.txt"));
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("C:\\Users\\xFact\\IdeaProjects\\advanceJavaTechinics\\src\\inputOutFilesApi\\outPutCopy.txt"));
            String s;
            while((s= br.readLine()) != null){
                bw.write(s +"\n");
            }
            br.close();
            bw.close();


        }catch(Exception ex){
            return;
        }

    }
}

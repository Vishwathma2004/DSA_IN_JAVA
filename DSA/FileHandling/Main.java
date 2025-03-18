package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try(InputStreamReader isr = new InputStreamReader(System.in)){
            System.out.println("Enter some letters: ");
            int letter = isr.read();
            while (isr.ready()) {
                System.out.println((char) letter);
                letter = isr.read();
            }
            System.out.println();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        try(FileReader fr = new FileReader("note.txt")){
            int input = fr.read();
            while(fr.ready()){
                System.out.println((char)input);
                input = fr.read();
            }
            
            System.out.println();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }

        //byte to character stream then bufferedReader reading in character stream
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("You typed: " + br.readLine());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

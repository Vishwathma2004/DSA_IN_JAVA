package CodeWithVishwa.PrintDuplicates;

import java.util.*;

public class printDuplicateCharacter {
    static void printDuplicate(String s){
        HashMap<Character,Integer> freq = new HashMap<>();
        for(char c:s.toCharArray()){
            freq.put(c,freq.getOrDefault(c, 0)+1);
            
        }
        for(Map.Entry<Character,Integer> it:freq.entrySet()){
            if(it.getValue()>1){
                System.out.print("["+it.getKey()+","+it.getValue()+"]");
            }
        }
    }
    public static void main(String[] args) {

        String s = "geeksforgeeks";

        printDuplicate(s);
    }
}

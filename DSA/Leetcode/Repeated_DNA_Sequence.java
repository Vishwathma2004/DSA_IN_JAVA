/*
https://leetcode.com/problems/repeated-dna-sequences/description/
187. Repeated DNA Sequences

The DNA sequence is composed of a series of nucleotides abbreviated as 'A', 'C', 'G', and 'T'.
For example, "ACGAATTCCG" is a DNA sequence.
When studying DNA, it is useful to identify repeated sequences within the DNA.
Given a string s that represents a DNA sequence, return all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule. You may return the answer in any order.

Example 1:
Input: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
Output: ["AAAAACCCCC","CCCCCAAAAA"]
Example 2:

Input: s = "AAAAAAAAAAAAA"
Output: ["AAAAAAAAAA"]
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Repeated_DNA_Sequence {

    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> seen = new HashSet<>();
        HashSet<String> repeated = new HashSet<>();
        for (int i = 0; i < s.length() - 9; i++) {
            String sequence = s.substring(i, i + 10);
            if (!seen.add(sequence)) {
                repeated.add(sequence);
            }
        }
        return new ArrayList<>(repeated);
    }

    public static void main(String[] args) {
        Repeated_DNA_Sequence obj = new Repeated_DNA_Sequence();

        String dna = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        List<String> repeatedSequences = obj.findRepeatedDnaSequences(dna);

        System.out.println("Repeated DNA sequences of length 10:");
        for (String seq : repeatedSequences) {
            System.out.println(seq);
        }
    }
}
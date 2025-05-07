//https://leetcode.com/problems/word-ladder/description/
/*
127. Word Ladder
A transformation sequence from word beginWord to word endWord using a dictionary wordList is a sequence of words beginWord -> s1 -> s2 -> ... -> sk such that:

Every adjacent pair of words differs by a single letter.
Every si for 1 <= i <= k is in wordList. Note that beginWord does not need to be in wordList.
sk == endWord
Given two words, beginWord and endWord, and a dictionary wordList, return the number of words in the shortest transformation sequence from beginWord to endWord, or 0 if no such sequence exists.

 

Example 1:

Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]
Output: 5
Explanation: One shortest transformation sequence is "hit" -> "hot" -> "dot" -> "dog" -> cog", which is 5 words long.
 */


import java.util.*;

class WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord)){
            return 0;
        }
        Set<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);
        int length = 0;

        while(!q.isEmpty()){
            int size = q.size();
            length++;

            for(int i = 0; i < size; i++){
                String current = q.poll();

                for(int j = 0; j < current.length(); j++){
                    char[] temp = current.toCharArray();

                    for(char ch = 'a'; ch <= 'z'; ch++){
                        temp[j] = ch;
                        String newWord = new String(temp);

                        if(newWord.equals(endWord)){
                            return length + 1;
                        }

                        if(wordList.contains(newWord) && !visited.contains(newWord)){
                            q.offer(newWord);
                            visited.add(newWord);
                        }
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for beginWord, endWord, and wordList
        System.out.print("Enter the begin word: ");
        String beginWord = scanner.nextLine();

        System.out.print("Enter the end word: ");
        String endWord = scanner.nextLine();

        System.out.print("Enter the number of words in the word list: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // consume the newline character

        List<String> wordList = new ArrayList<>();
        System.out.println("Enter the words in the word list:");
        for (int i = 0; i < n; i++) {
            wordList.add(scanner.nextLine());
        }

        // Create an instance of WordLadder and call ladderLength
        WordLadder wordLadder = new WordLadder();
        int result = wordLadder.ladderLength(beginWord, endWord, wordList);

        // Output the result
        if(result > 0) {
            System.out.println("The length of the shortest transformation sequence is: " + result);
        } else {
            System.out.println("No transformation sequence exists.");
        }

        scanner.close();
    }
}

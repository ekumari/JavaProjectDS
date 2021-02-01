package com.test.ds;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class TrieNode{
    Map<Character, TrieNode> child;
    boolean endOfWord;

    TrieNode(){
       child = new HashMap<>();
       endOfWord = false;
    }
}

public class PhoneDirectory {
    TrieNode root = new TrieNode();

    public void insertIntoTrie(String contacts[])
    {
        root = new TrieNode();
        int n = contacts.length;
        for (int i = 0; i < n; i++)
        {
            insert(contacts[i].toLowerCase());
        }
    }

    public void insert(String word){
        TrieNode current = root;
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            TrieNode node = current.child.get(ch);
            if(node == null){
                node = new TrieNode();
                current.child.put(ch,node);
            }
            current = node;
        }
        current.endOfWord = true;
    }

    public void searchNode(String word){
        TrieNode current = root;
        String prefix = "";
        int i=0;
        for(i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            prefix += word.charAt(i);
            TrieNode node = current.child.get(ch);
            if(node == null){
                System.out.println("No result found for "+prefix);
                i++;
                break;
            }
            System.out.println("Suggestions based on "+ prefix + " are");
                    displayContactsUtil(node, prefix);
            current = node;
        }
        //Remaining prefix
        for ( ; i < word.length(); i++)
        {
            prefix += word.charAt(i);
            System.out.println("No Results Found for "+ prefix);
        }
    }

    public void displayContactsUtil(TrieNode node, String prefix) {
        if(node.endOfWord){
            String firstLetter = prefix.substring(0, 1);
            String remainingLetters = prefix.substring(1, prefix.length());
           // System.out.println(prefix);
            firstLetter = firstLetter.toUpperCase();
            String name = firstLetter + remainingLetters;
            System.out.println(name);
        }


        for (char i = 'a'; i <= 'z'; i++)
        {
            TrieNode nextNode = node.child.get(i);
            if (nextNode != null)
            {
                displayContactsUtil(nextNode, prefix + i);
            }
        }
    }

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        String searchString;
            do{
                System.out.println("-------------------------");
                System.out.println("Enter string to be search");
                searchString = myObj.nextLine();
                if (!searchString.matches("[a-zA-Z_]+")) {
                    System.out.println("Invalid input. Please enter only alphabets!!");
                    continue;
                }
                if(searchString.compareToIgnoreCase("exit") == 0 || searchString.compareToIgnoreCase("quit") == 0 ){
                    break;
                }else{
                    String contacts[] = {"Anjani","Anand","Anandi","Manisha", "Anup", "Aditya", "Manish", "Monika","Anjali"};
                    PhoneDirectory ph = new PhoneDirectory();
                    ph.insertIntoTrie(contacts);
                    ph.searchNode(searchString.toLowerCase());
                }
            }while(true);

    }
}

package com.test.ds;

import java.util.*;

public class Anagram {

    public static void findGroupAnagram(String[] str){
        HashMap<String, List<String>> hmap = new HashMap<>();

        for(int i=0; i<str.length; i++){
            String word = str[i];
            char letters[] = word.toCharArray();
            Arrays.sort(letters);
            String newWord = new String(letters);
            if(hmap.containsKey(newWord)){
                hmap.get(newWord).add(word);
            }else{
                List<String> words = new ArrayList<>();
                words.add(word);
                hmap.put(newWord,words);
            }
        }

        //Iterate over hashmap to get the group anagram
        for (String s : hmap.keySet()) {
            List<String> values = hmap.get(s);
            if (values.size() > 0) {
                System.out.print(values);
            }
        }
    }

    public static void main(String args[]){
        String arr[] = { "cat", "dog", "tac", "god", "act"};
        findGroupAnagram(arr);
    }
}

package ar.edu.itba;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyQGram {
    private int n;
    public MyQGram(int n){
        this.n=n;
    }
    private HashMap<String,Integer> getTokens(String word){
        for (int i = 0; i < (n+1)/2; i++) {
            word = "#" + word + "#";
        }
        List<String> tokens = new ArrayList<>();
        for (int i = 0; i < word.length()-n+1; i++) {
            tokens.add(word.substring(i, i+n));
        }
        HashMap<String,Integer> map = new HashMap<>();
        for (String token : tokens) {
            map.put(token, map.getOrDefault(token, 0) + 1);
        }
        return map;
    }
    public void printTokens(String word){
        Map<String,Integer> map = getTokens(word);
        for(String s:getTokens(word).keySet()){
            System.out.println(s+" "+map.get(s));
        }
    }
    public double similarity(String w1, String w2){
        Map<String,Integer> map = getTokens(w1);
        Map<String,Integer> map2 = getTokens(w2);
        int match=0;
        for (String s:map.keySet()){
            if (map2.containsKey(s)){
                match++;
                if (map2.get(s)>0){
                    map2.put(s, map2.get(s)-1);
                }
            }
        }
        return (double)(match*2)/(map.size()+map2.size());
    }

}

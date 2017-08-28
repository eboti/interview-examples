package com;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MaximumRepeatedWord {

	public static void main(String[] args) throws IOException {
		
		findMaxRepeatedWord();
	}
	
	public static void findMaxRepeatedWord() throws IOException{
		
        String contents = new String(Files.readAllBytes(Paths.get("manifest.mf")));
        
        // remove ., 
        contents = contents.replaceAll("\\,", "");

        contents = contents.replaceAll("\\.", "");
        
        // split into words
        String[] words = contents.split("\\s");

        // foreach
        // put into map
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String word : words){
        	if (!"".equals(word)){
        		if (!map.containsKey(word)){
        			map.put(word, 1);
        		}else{
        			map.put(word, map.get(word)+1);
        		}        		
        	}
        }        
        
        // foreach get max 
        int max = 0;        
        for (Integer value : map.values()){
        	if (value > max){
        		max = value;
        	}
        }
        
        for (Entry entry : map.entrySet()){
        	if (((Integer)entry.getValue()).intValue() == max){
        		System.out.println(entry.getKey() + " : " + entry.getValue());
        	}
        }
	}

}

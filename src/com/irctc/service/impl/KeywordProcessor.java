package com.irctc.service.impl;

import com.irctc.service.IColorFormatter;

import java.util.*;

public class KeywordProcessor {

    private Set<String> keyWords;

    public KeywordProcessor() {
        keyWords = new HashSet<>();
    }

    public void addKeyword(String keyword) {
        keyWords.add(keyword);
    }

    public String processText(String inputText) {
        String copy = inputText;
        for(String key : keyWords){
            final TextFormatter formatter = KeywordFormatter.getFormatterForKeyword(key);
            if(inputText.contains(key)){
                copy = copy.replaceAll(key,formatter.format(key));
            }
        }
        return copy;
    }
}

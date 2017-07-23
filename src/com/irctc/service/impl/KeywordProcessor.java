package com.irctc.service.impl;

import com.irctc.service.IFormatter;

import java.util.*;

public class KeywordProcessor {

    private Set<String> keyWords;

    private IFormatter formatter;



    public KeywordProcessor() {
        keyWords = new HashSet<>();
        this.formatter = new BlueFormatter();
    }

    public void addKeyword(String keyword) {
        keyWords.add(keyword);
    }

    public String processText(String inputText) {
        String copy = inputText;
        for(String key : keyWords){
            final IFormatter formatter = KeywordFormatter.getFormatterForKeyword(key);
            if(inputText.contains(key)){
                copy = copy.replaceAll(key,formatter.format(key));
            }
        }
        return copy;
    }

    public void setFormatter(IFormatter formatter) {
        this.formatter = formatter;
    }
}

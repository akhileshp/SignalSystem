package com.irctc.service.impl;

import com.irctc.service.IFormatter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

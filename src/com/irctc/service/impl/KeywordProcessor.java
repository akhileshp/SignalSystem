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
        StringBuilder output = new StringBuilder();
        int lastIndex = -1;
        for(String key : keyWords){
            int index = inputText.indexOf(key);
            if(index!=-1){
                lastIndex = index;
                //  test dys fjf  if fkjfk fdjdjd
                //
                output.append(inputText.substring(0,index));
                int length = output.length();
                output.append(formatter.format(key));
                output.append(inputText.substring(length+key.length()));
            }
        }
        return output.toString();
    }

    public void setFormatter(IFormatter formatter) {
        this.formatter = formatter;
    }
}

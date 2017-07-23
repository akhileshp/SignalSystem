package com.irctc.service.impl;

import java.util.HashSet;
import java.util.Set;

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
        for (String key : keyWords) {
            final TextFormatter formatter = KeywordFormatter.getFormatterForKeyword(key);
            if (formatter != null) {
                if (inputText.contains(key)) {
                    copy = copy.replaceAll(key, formatter.format(key));
                }
            }
        }
        return copy;
    }
}

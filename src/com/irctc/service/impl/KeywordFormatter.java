package com.irctc.service.impl;

import com.irctc.service.IColorFormatter;

import java.util.HashMap;
import java.util.Map;

public class KeywordFormatter {
   private static Map<String, TextFormatter> keywordFormatterMap = new HashMap<>();;

   static  {
        keywordFormatterMap.put("as", new TextFormatter(new UpperCaseFormatter(),new BlueColorFormatter()));
        keywordFormatterMap.put("if", new TextFormatter(new LowerCaseFormatter(),new RedColorFormatter()));
        keywordFormatterMap.put("and",new TextFormatter(new UpperCaseFormatter(),new RedColorFormatter()));
        keywordFormatterMap.put("then", new TextFormatter(new LowerCaseFormatter(),new GreenColorFormatter()));
        keywordFormatterMap.put("when", new TextFormatter(new LowerCaseFormatter(),new BlueColorFormatter()));
    }

    public static TextFormatter getFormatterForKeyword(final String keyword){
        return keywordFormatterMap.get(keyword);
    }

    public static void addFormatterForKeyword(final String keyword, final TextFormatter iFormatter){
        keywordFormatterMap.put(keyword, iFormatter);
    }
}

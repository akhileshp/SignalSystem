package com.irctc.service.impl;

import com.irctc.service.IFormatter;

import java.util.HashMap;
import java.util.Map;

public class KeywordFormatter {
   private static Map<String, IFormatter> keywordFormatterMap = new HashMap<>();;

   static  {
        keywordFormatterMap.put("as", new BlueFormatter());
        keywordFormatterMap.put("if", new RedFormatter());
        keywordFormatterMap.put("and", new RedFormatter());
        keywordFormatterMap.put("then", new GreenFormatter());
        keywordFormatterMap.put("when", new BlueFormatter());
    }

    public static IFormatter getFormatterForKeyword(final String keyword){
        return keywordFormatterMap.get(keyword);
    }

    public static void addFormatterForKeyword(final String keyword, final IFormatter iFormatter){
        keywordFormatterMap.put(keyword, iFormatter);
    }
}

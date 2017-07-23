package com.irctc.service.impl;

import com.irctc.service.IColorFormatter;

import java.util.HashMap;
import java.util.Map;

public class KeywordFormatter {
   private static Map<String, TextFormatter> keywordFormatterMap = new HashMap<>();;

   static  {
        keywordFormatterMap.put("as", new TextFormatter(new UpperCaseFormatter(),new BlueColorFormatter()));
       TextFormatter ifFormatter = new TextFormatter(new LowerCaseFormatter(), new RedColorFormatter());
       ifFormatter.setFontWeightFormatter(new BoldFontWeigthFormatter());
       keywordFormatterMap.put("if", ifFormatter);
       TextFormatter andFormatter = new TextFormatter(new UpperCaseFormatter(), new RedColorFormatter());
       andFormatter.setFontWeightFormatter(new BoldFontWeigthFormatter());
       keywordFormatterMap.put("and", andFormatter);
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

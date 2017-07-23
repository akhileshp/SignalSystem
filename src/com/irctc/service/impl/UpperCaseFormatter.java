package com.irctc.service.impl;

import com.irctc.service.ICaseFormatter;

public class UpperCaseFormatter implements ICaseFormatter{

    @Override
    public String changeCase(String input) {
        return input.toUpperCase();
    }
}

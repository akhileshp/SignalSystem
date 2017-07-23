package com.irctc.service.impl;

import com.irctc.service.ICaseFormatter;

public class LowerCaseFormatter implements ICaseFormatter{

    @Override
    public String changeCase(String imput) {
        return imput.toLowerCase();
    }
}

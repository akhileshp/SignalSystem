package com.irctc.service.impl;

import com.irctc.service.IColorFormatter;

public class RedColorFormatter implements IColorFormatter {

    @Override
    public String format(String str) {
        return "[red]"+str+"[red]";
    }
}

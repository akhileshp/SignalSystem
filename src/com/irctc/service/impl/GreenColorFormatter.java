package com.irctc.service.impl;

import com.irctc.service.IColorFormatter;

public class GreenColorFormatter implements IColorFormatter {

    @Override
    public String format(String str) {
        return "[green]"+str+"[green]";
    }
}

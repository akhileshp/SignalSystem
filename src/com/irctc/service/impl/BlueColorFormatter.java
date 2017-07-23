package com.irctc.service.impl;

import com.irctc.service.IColorFormatter;

public class BlueColorFormatter implements IColorFormatter {

    @Override
    public String format(String str) {
        return "[blue]"+str+"[blue]";
    }
}

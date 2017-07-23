package com.irctc.service.impl;

import com.irctc.service.IFormatter;

public class BlueFormatter implements IFormatter {

    @Override
    public String format(String str) {
        return "[blue]"+str+"[blue]";
    }
}

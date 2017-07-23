package com.irctc.service.impl;

import com.irctc.service.IFormatter;

public class RedFormatter  implements IFormatter {

    @Override
    public String format(String str) {
        return "[red]"+str+"[red]";
    }
}

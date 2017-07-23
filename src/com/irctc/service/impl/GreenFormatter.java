package com.irctc.service.impl;

import com.irctc.service.IFormatter;

public class GreenFormatter  implements IFormatter {

    @Override
    public String format(String str) {
        return "[green]"+str+"[green]";
    }
}

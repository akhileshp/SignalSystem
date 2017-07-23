package com.irctc.service.impl;

import com.irctc.service.IFontWeightFormatter;

public class BoldFontWeigthFormatter implements IFontWeightFormatter {

    @Override
    public String applyWeight(String input) {
        return "[bold]" +input+"[bold]";
    }
}

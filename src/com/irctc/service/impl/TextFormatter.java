package com.irctc.service.impl;

import com.irctc.service.ICaseFormatter;
import com.irctc.service.IColorFormatter;

public class TextFormatter {

    private ICaseFormatter caseFormatter;

    private IColorFormatter colorFormatter;

    public TextFormatter(ICaseFormatter caseFormatter, IColorFormatter colorFormatter) {
        this.caseFormatter = caseFormatter;
        this.colorFormatter = colorFormatter;

    }

    public ICaseFormatter getCaseFormatter() {
        return caseFormatter;
    }

    public IColorFormatter getColorFormatter() {
        return colorFormatter;
    }

    public String format(String str) {
        return colorFormatter.format(caseFormatter.changeCase(str));
    }

}

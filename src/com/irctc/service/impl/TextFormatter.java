package com.irctc.service.impl;

import com.irctc.service.ICaseFormatter;
import com.irctc.service.IColorFormatter;
import com.irctc.service.IFontWeightFormatter;

public class TextFormatter {

    private ICaseFormatter caseFormatter;

    private IColorFormatter colorFormatter;

    private IFontWeightFormatter fontWeightFormatter;

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

    public void setFontWeightFormatter(IFontWeightFormatter fontWeightFormatter) {
        this.fontWeightFormatter = fontWeightFormatter;
    }

    public String format(String str) {
        String colorFormatText = caseFormatter.changeCase(str);
        if (fontWeightFormatter != null) {
            return colorFormatter.format(fontWeightFormatter.applyWeight(colorFormatText));
        }
        return colorFormatter.format(colorFormatText);
    }

}

package test.com.irctc;

import com.irctc.service.impl.KeywordProcessor;
import org.junit.Test;

public class KeywordProcessorTest {

    @Test
    public void shouldFormatTextToHighlightKeyWords(){
        KeywordProcessor processor = new KeywordProcessor();
        processor.addKeyword("as");
        processor.addKeyword("if");
        processor.addKeyword("and");
        processor.addKeyword("then");
        processor.addKeyword("when");
        String inputText = "gdgd uf if shst ";
        String expectedText = "gdgd uf [blue]if[blue] shst ";
        String processedText  = processor.processText(inputText);
        assert expectedText.equals(processedText);
    }
}

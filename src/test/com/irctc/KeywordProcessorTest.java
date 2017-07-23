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
        String inputText = "gdgd as uf if shst if ";
        String expectedText = "gdgd [blue]as[blue] uf [blue]if[blue] shst [blue]if[blue] ";
        String processedText  = processor.processText(inputText);
        assert expectedText.equals(processedText);
    }
}

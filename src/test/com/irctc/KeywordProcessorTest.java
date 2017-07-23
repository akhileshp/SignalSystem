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
        String inputText = "gdgd as uf if shst then and";
        String expectedText = "gdgd [blue]AS[blue] uf [red]if[red] shst [green]then[green] [red]AND[red]";
        String processedText  = processor.processText(inputText);
        assert expectedText.equals(processedText);
    }
}

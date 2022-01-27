import static org.junit.Assert.*;
//static
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
//import java.util.List;

public class MarkdownParseTest {
    //declare a test method
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

@Test 

 public void Testgetlinks()throws IOException{

    Path fileName = Path.of("test-file.md");
	String contents = Files.readString(fileName);
    ArrayList<String> links = MarkdownPasrse.getLinks(contents);
    assertEquals(List.of("https:something.com", "some-page.htm"),links);
 }
}


import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

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
    ArrayList<String> links = MarkdownParse.getLinks(contents);
    assertEquals(List.of("https://something.com","some-page.html"),links);
 }
 
 @Test 
 public void Testgetlink2()throws IOException{

    Path fileName = Path.of("test-file2.md");
	String contents = Files.readString(fileName);
    ArrayList<String> links = MarkdownParse.getLinks(contents);
    assertEquals(List.of("something.in"),links);
 }
 
 @Test 
 public void Testgetlink3()throws IOException{

    Path fileName = Path.of("test-file3.md");
	String contents = Files.readString(fileName);
    ArrayList<String> links = MarkdownParse.getLinks(contents);
    assertEquals(List.of("rocknroll.com","wowcserocks.com","profpolitzisprettychill.com","gotritons.edu"),links);
 }
 
 @Test 
 public void Testgetlink4()throws IOException{
    Path fileName = Path.of("test-file4.md");
	String contents = Files.readString(fileName);
    ArrayList<String> links = MarkdownParse.getLinks(contents);
    assertEquals(List.of(),links);
 }
 @Test
 public void Testgetlink5()throws IOException{
    Path fileName = Path.of("test-file6.md");
	String contents = Files.readString(fileName);
    ArrayList<String> links = MarkdownParse.getLinks(contents);
    assertEquals(List.of(),links);
 }
 @Test
 public void testmy10(){
 Path filename = Path.of("./test-file9.md");
 String contents = "";
 try {
     contents = Files.readString(filename);
 } catch (IOException e) {
     e.printStackTrace();
 }
 assertEquals("[google.com, google.com,ucsd.edu]", MarkdownParse.getLinks(contents));
}
@Test
 public void testmy11(){
 Path filename = Path.of("./test-file10.md");
 String contents = "";
 try {
     contents = Files.readString(filename);
 } catch (IOException e) {
     e.printStackTrace();
 }
 assertEquals("[a.com(()), example.com]", MarkdownParse.getLinks(contents));
}
@Test
 public void testmy12(){
 Path filename = Path.of("./test-file11.md");
 String contents = "";
 try {
     contents = Files.readString(filename);
 } catch (IOException e) {
     e.printStackTrace();
 }
 assertEquals("[https://ucsd-cse15l-w22.github.io/]", MarkdownParse.getLinks(contents));
}

}

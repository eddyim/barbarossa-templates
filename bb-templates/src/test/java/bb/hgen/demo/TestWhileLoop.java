package bb.hgen.demo;

import java.io.IOException;


public class TestWhileLoop extends bb.runtime.BaseBBTemplate {

private static TestWhileLoop INSTANCE = new TestWhileLoop();


    public static String render() {
        StringBuilder sb = new StringBuilder();
        renderInto(sb);
        return sb.toString();
    }

    public static void renderInto(Appendable buffer) {
        INSTANCE.renderImpl(buffer);
    }

    public void renderImpl(Appendable buffer) {
    try {
            buffer.append("<!DOCTYPE html>\n");
            int fontSize = 0;
            buffer.append("\n<html>\n    <head><title>WHILE LOOP Example</title></head>\n\n    <body>\n        ");
            while ( fontSize <= 3){
            buffer.append("\n            <font color = \"green\" size = \"");
            buffer.append(toS(fontSize));
            buffer.append("\">\n                JSP Tutorial\n            </font><br />\n            ");
            fontSize++;
            buffer.append("\n        ");
            }
            buffer.append("\n    </body>\n</html>");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

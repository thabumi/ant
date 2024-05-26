import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
public class AntlrParser {
    public static void main (String[] args) throws IOException {
        CharStream charStream = CharStreams.fromFileName("D:\\antlr\\cmakelists\\CMakeLists1.txt");
        CMakeLexer cmakeLexer = new CMakeLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(cmakeLexer);
        CMakeParser cmakeParser = new CMakeParser(commonTokenStream);
        ParseTree parseTree = cmakeParser.file_();

        System.out.println("done");
    }
}
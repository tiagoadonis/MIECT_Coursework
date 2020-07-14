import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;

public class Java8Main {
   public static void main(String[] args) throws IOException{
      if(args.length != 1){
		 System.err.println("ERROR!! Too many arguments!");
		 System.exit(1);
	  }
      try {
         // create a CharStream that reads from standard input:
         CharStream input = CharStreams.fromFileName(args[0]);
         // create a lexer that feeds off of input CharStream:
         Java8Lexer lexer = new Java8Lexer(input);
         // create a buffer of tokens pulled from the lexer:
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         // create a parser that feeds off the tokens buffer:
         Java8Parser parser = new Java8Parser(tokens);
         // replace error listener:
         //parser.removeErrorListeners(); // remove ConsoleErrorListener
         //parser.addErrorListener(new ErrorHandlingListener());
         // begin parsing at compilationUnit rule:
         ParseTree tree = parser.compilationUnit();
         if (parser.getNumberOfSyntaxErrors() == 0) {
            // print LISP-style tree:
            // System.out.println(tree.toStringTree(parser));
            ParseTreeWalker walker = new ParseTreeWalker();
            ExtractInformation listener0 = new ExtractInformation();
            walker.walk(listener0, tree);
         }
      }
      catch(IOException e) {
         e.printStackTrace();
         System.exit(1);
      }
      catch(RecognitionException e) {
         e.printStackTrace();
         System.exit(1);
      }
   }
}

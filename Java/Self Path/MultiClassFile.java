import java.util.Scanner;
import java.util.regex.MatchResult;

/*
 * Classes that are not member of the core JDK must be added as import statements on the top of the code.
 * It differs from C++ where the #include actually includes the source file code where the directive lives. Here the
 * import statement is just a reference to the class file.
 */
public class MultiClassFile {
    public static void main(String[] args) {
        System.out.println(GenerateMessage.generateMessage());
        System.out.println(AntoherMessage.generateAnotherMessage());
    }
}

class GenerateMessage {
    static String generateMessage() {
        return "Here's the first message";
    }
}

class AntoherMessage {
    static String generateAnotherMessage() {
        return "Here's the second message";
    }
}
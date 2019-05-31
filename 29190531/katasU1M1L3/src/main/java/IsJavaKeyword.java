import java.util.Scanner;

public class IsJavaKeyword {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a Word");
        String inputData = myScanner.nextLine().trim();
        boolean javaKeyWord = false;
        if (inputData.equals( "abstract")) {javaKeyWord = true;   }
        if (inputData.equals( "assert")) {javaKeyWord = true;   }
        if (inputData.equals( "boolean")) {javaKeyWord = true;   }
        if (inputData.equals( "break")) {javaKeyWord = true;   }
        if (inputData.equals( "byte")) {javaKeyWord = true;   }
        if (inputData.equals( "case")) {javaKeyWord = true;   }
        if (inputData.equals( "catch")) {javaKeyWord = true;   }
        if (inputData.equals( "char")) {javaKeyWord = true;   }
        if (inputData.equals( "class")) {javaKeyWord = true;   }
        if (inputData.equals( "const")) {javaKeyWord = true;   }
        if (inputData.equals( "continue")) {javaKeyWord = true;   }
        if (inputData.equals( "default")) {javaKeyWord = true;   }
        if (inputData.equals( "do")) {javaKeyWord = true;   }
        if (inputData.equals( "double")) {javaKeyWord = true;   }
        if (inputData.equals( "else")) {javaKeyWord = true;   }
        if (inputData.equals( "enum")) {javaKeyWord = true;   }
        if (inputData.equals( "extends")) {javaKeyWord = true;   }
        if (inputData.equals( "final")) {javaKeyWord = true;   }
        if (inputData.equals( "finally")) {javaKeyWord = true;   }
        if (inputData.equals( "float")) {javaKeyWord = true;   }
        if (inputData.equals( "for")) {javaKeyWord = true;   }
        if (inputData.equals( "goto")) {javaKeyWord = true;   }
        if (inputData.equals( "if")) {javaKeyWord = true;   }
        if (inputData.equals( "implements")) {javaKeyWord = true;   }
        if (inputData.equals( "import")) {javaKeyWord = true;   }
        if (inputData.equals( "instanceof")) {javaKeyWord = true;   }
        if (inputData.equals( "int")) {javaKeyWord = true;   }
        if (inputData.equals( "interface")) {javaKeyWord = true;   }
        if (inputData.equals( "long")) {javaKeyWord = true;   }
        if (inputData.equals( "native")) {javaKeyWord = true;   }
        if (inputData.equals( "new")) {javaKeyWord = true;   }
        if (inputData.equals( "null")) {javaKeyWord = true;   }
        if (inputData.equals( "package")) {javaKeyWord = true;   }
        if (inputData.equals( "private")) {javaKeyWord = true;   }
        if (inputData.equals( "protected")) {javaKeyWord = true;   }
        if (inputData.equals( "public")) {javaKeyWord = true;   }
        if (inputData.equals( "return")) {javaKeyWord = true;   }
        if (inputData.equals( "short")) {javaKeyWord = true;   }
        if (inputData.equals( "static")) {javaKeyWord = true;   }
        if (inputData.equals( "strictfp")) {javaKeyWord = true;   }
        if (inputData.equals( "super")) {javaKeyWord = true;   }
        if (inputData.equals( "switch")) {javaKeyWord = true;   }
        if (inputData.equals( "synchronized")) {javaKeyWord = true;   }
        if (inputData.equals( "this")) {javaKeyWord = true;   }
        if (inputData.equals( "throw")) {javaKeyWord = true;   }
        if (inputData.equals( "throws")) {javaKeyWord = true;   }
        if (inputData.equals( "transient")) {javaKeyWord = true;   }
        if (inputData.equals( "try")) {javaKeyWord = true;   }
        if (inputData.equals( "void")) {javaKeyWord = true;   }
        if (inputData.equals( "volatile")) {javaKeyWord = true;   }
        if (inputData.equals( "while")) {javaKeyWord = true;   }


        if (javaKeyWord){
            System.out.println(inputData + " is a Java Keyword");
        }
        else{
            System.out.println(inputData + " is not a Java Keyword");
        }

    }
}
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Main {

    static String Reset = "\u001b[0m";

    static String BackgroundBlack = "\u001b[40m";
    static String BackgroundRed = "\u001b[41m";
    static String BackgroundYellow = "\u001b[43m";
    static String BackgroundBlue = "\u001b[44m";
    static String BackgroundWhite = "\u001b[47m";

    static String Italic = "\u001b[3m";
    static String Bold = "\u001b[1m";
    static String Underline = "\u001b[4m";

    static void printUkranianFlag(){
        for (int i = 0; i < 5; i++) {
            System.out.print(BackgroundBlue + "                                 " + Reset + "\n");
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(BackgroundYellow  + "                                 " + Reset + "\n");
        }

        System.out.print( "                " + Reset + "\n");
        System.out.print(Italic + Bold + Underline +"Ukraine" + Reset + "\n");
        System.out.print( "                " + Reset + "\n");
    }
    static  void printGreekFlag(){
        String blueBlock = BackgroundBlue + "     ";
        String whiteBlock = BackgroundWhite + "  ";
        String blueShortLine = BackgroundBlue + "                     ";
        String whiteShortLine = BackgroundWhite + "                     ";
        String veryShortWhiteLine = BackgroundWhite + "            ";
        String longWhiteLine = BackgroundWhite + "                                 ";
        String lonBlueLine = BackgroundBlue + "                                 ";
        //String firstLineOf

        System.out.print(blueBlock + whiteBlock + blueBlock + blueShortLine + Reset + "\n");
        System.out.print(blueBlock + whiteBlock + blueBlock + whiteShortLine + Reset + "\n");
        System.out.print(veryShortWhiteLine + blueShortLine +  Reset + "\n");
        System.out.print(blueBlock + whiteBlock + blueBlock + whiteShortLine + Reset + "\n");
        System.out.print(blueBlock + whiteBlock + blueBlock + blueShortLine + Reset + "\n");
        System.out.print(longWhiteLine + Reset + "\n");
        System.out.print(lonBlueLine + Reset + "\n");
        System.out.print(longWhiteLine + Reset + "\n");
        System.out.print(lonBlueLine + Reset + "\n");

        System.out.print( "                " + Reset + "\n");
        System.out.print(Italic + Bold + Underline +"Greece" + Reset + "\n");
        System.out.print( "                " + Reset + "\n");

    }

    static void printFrenchFlag (){
        String blueBlock = BackgroundBlue + "           ";
        String whiteBlock = BackgroundWhite + "           ";
        String redBlock = BackgroundRed + "           ";

        for (int i = 0; i < 9; i++) {
        System.out.print(blueBlock + whiteBlock + redBlock + Reset + "\n");
        }

        System.out.print( "                " + Reset + "\n");
        System.out.print(Italic + Bold + Underline +"France" + Reset + "\n");
        System.out.print( "                " + Reset + "\n");
    }

    static  void printSpanisFlag(){
        String redLine = BackgroundRed + "                                 ";
        String yellowLine = BackgroundYellow + "                                 ";

        for (int i = 0; i < 2; i++) {
            System.out.print(redLine + Reset + "\n");
        };
        for (int i = 0; i < 5; i++) {
            System.out.print(yellowLine + Reset + "\n");
        };
        for (int i = 0; i < 2; i++) {
            System.out.print(redLine + Reset + "\n");
        };

        System.out.print( "                " + Reset + "\n");
        System.out.print(Italic + Bold + Underline +"Spain" + Reset + "\n");
        System.out.print( "                " + Reset + "\n");
    }
    static  void printCatalanFlag(){
        String redLine = BackgroundRed + "                                 ";
        String yellowLine = BackgroundYellow + "                                 ";

        for (int i = 0; i < 4; i++) {
            System.out.print(yellowLine + Reset + "\n");
            System.out.print(redLine + Reset + "\n");
        };

        System.out.print( "                " + Reset + "\n");
        System.out.print(Italic + Bold + Underline +"Cataluña" + Reset + "\n");
        System.out.print( "                " + Reset + "\n");
    }
    static  void printGermanFlag(){
        String redLine = BackgroundRed + "                                 ";
        String yellowLine = BackgroundYellow + "                                 ";
        String blackLine = BackgroundBlack + "                                 ";

        for (int i = 0; i < 3; i++) {
            System.out.print(blackLine + Reset + "\n");
        };
        for (int i = 0; i < 3; i++) {
            System.out.print(redLine + Reset + "\n");
        };
        for (int i = 0; i < 3; i++) {
            System.out.print(yellowLine + Reset + "\n");
        };

        System.out.print( "                " + Reset + "\n");
        System.out.print(Italic + Bold + Underline +"Germany" + Reset + "\n");
        System.out.print( "                " + Reset + "\n");
    }
    public static void main(String[] args) {
        printUkranianFlag();
        printGreekFlag();
        printFrenchFlag();
        printSpanisFlag();
        printCatalanFlag();
        printGermanFlag();
    }
}
package Assignment3;

public class ErrorMessage {
    public static void printError(String text) {
        // ANSI escape code for red text
        String redColorCode = "\u001B[31m";
        // ANSI escape code to reset text color
        String resetColorCode = "\u001B[0m";

        System.out.println(redColorCode + text + resetColorCode);
    }
}
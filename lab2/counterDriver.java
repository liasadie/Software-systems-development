import javax.swing.*;
import java.util.Scanner;

public class counterDriver extends wordProcessor{
    public static void main(String[] args1){
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter sentence:");
        String input = inputScanner.nextLine();

        wordProcessor processor = new wordProcessor();
        processor.setText(input);
        System.out.println("Words: " + processor.countWords(input));
        System.out.println("Letters: " + processor.countLetters(input));
        System.out.println("Length: " + processor.getLength(input));


    }
}

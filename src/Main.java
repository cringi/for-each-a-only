import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String word;
        Scanner input = new Scanner(System.in);
        ArrayList <String> words = new ArrayList();

        System.out.println("Enter a bunch of words, whatever makes you happy.");
        System.out.println("Just make sure you type \"STOP\" at some point.");

        do{
            word = input.nextLine();
            if (word.equals("STOP")) {
                break;
            }

            words.add(word);
        }while(!(word.equals("STOP")));

        for (String s: words) {
            if (s.contains("a")) {
                System.out.println(s);
            }
        }
    }
}

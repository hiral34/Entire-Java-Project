import java.util.Scanner;
public class WordCount {
    static void word_count(String user_string){
        int words = 1;
        int spaces = 0;
        for (int i=0; i<user_string.length(); i++){     // loop to iterate through every word in the string
            if (String.valueOf(user_string).charAt(i) == ' ' && i == 0){        // condition to set the counter right if 1st word is space
                words = 0;
            }
            if(String.valueOf(user_string).charAt(i) == ' '){       // spaces counter
               spaces = spaces + 1;
            }
            if(String.valueOf(user_string).charAt(i) == ' ' && String.valueOf(user_string).charAt(i+1) != ' '){   // word counter
                words = words + 1;
            }
        }   //print the output
        System.out.println("Number of words: " + words);
        System.out.println("Number of spaces: " + (spaces));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String user_string = scanner.nextLine();
        word_count(user_string);    // call the reusable method
    }
}

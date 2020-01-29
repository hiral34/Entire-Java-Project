import java.util.Scanner;
public class CountingA {
    static int char_count = 0;
    static void search_char(char c, String str_value, char case_sensitive){ // reusable search method that accepts search char, string and case as inputs
        char char_value;
        for (int i=0; i<str_value.length(); i++){       // loop to iterate through the string
            if (case_sensitive == 'y'){     // condition to use if user said search is case sensitive
                char_value = str_value.charAt(i);
                if(char_value == c){
                    char_count = char_count + 1;
                }
            }else {     // condition to use if user said search is NOT case sensitive
                char_value = str_value.toLowerCase().charAt(i);
                if(String.valueOf(char_value).matches(String.valueOf(c).toLowerCase())){
                    char_count = char_count + 1;
                }
            }
        }
        System.out.println("String: " + str_value);
        System.out.println("char count:" + char_count);
        if (char_count == 0){   // Print search results
            System.out.println("There is no match found to character " + c + " in the given string.");
        }else if (char_count == 1){
            System.out.println("There is 1 match found to character " + c + " in the given string.");
        }else{
            System.out.println("There are " + char_count + " matches to character " + c + " in the given string.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String str = scanner.nextLine();    // getting user string
        System.out.print("Please enter the character you would like to search in the string: ");
        char char_ans = scanner.next().charAt(0);   // getting search character
        System.out.print("Would you like the search to be case sensitive?:Y/N ");
        char case_sensitive = scanner.next().toLowerCase().charAt(0);   // getting case sensitive answer
        search_char(char_ans,str,case_sensitive);   // calling the method by passing the required arguments in
    }
}

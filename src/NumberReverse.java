import java.util.Scanner;
public class NumberReverse {
    public static void main(String[] args) {
        String reverse;
        reverse = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a 5 digit number: ");
        int num = scanner.nextInt();
        int length = String.valueOf(num).length();
        if(length == 5){    // check condition to only reverse the number if it is 5 digit long not otherwise
            for (int i=4; i>=0; i--){   // run a reverse loop to reverse the number
                reverse = reverse + String.valueOf(num).charAt(i);
            }
            System.out.println("The reverse of this 5 digit number is: "+ reverse);
        }else{
            System.out.println("Invalid number of digits. Please try again and enter exactly 5 digits.");
        }
    }
}

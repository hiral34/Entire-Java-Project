import java.util.Scanner;
public class OddEvenSum {
    public static void main(String[] args) {
        int odd, even, sum; //declare variables
        odd=0;  //initialise variables
        even=0;
        sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a 5 digit number: ");
        int number = scanner.nextInt();
        int length = String.valueOf(number).length();   //check the length of user input number by converting it into string and using length function
        if(length == 5){        //check if length is 5 then find the odd/even else exit asking for exact 5 digits.
            for (int i=0; i<5; i++){        //iterate between each numbers to find odd, even and total of each number
                char temp = String.valueOf(number).charAt(i);
                if(Integer.parseInt(String.valueOf(temp)) == 1 || Integer.parseInt(String.valueOf(temp)) == 3 || Integer.parseInt(String.valueOf(temp)) == 5 || Integer.parseInt(String.valueOf(temp)) == 7 || Integer.parseInt(String.valueOf(temp)) == 9){
                    odd = odd + 1;
                }else{
                    even += 1;
                }
                sum = sum + Integer.parseInt(String.valueOf(temp));
            }   //print out the result below:
            System.out.println("Total number of odds: " + odd);
            System.out.println("Total number of evens: " + even);
            System.out.println("Sum of all 5 digits is: " + sum);
        }else{
            System.out.println("Invalid number of digits. Please try again and enter exactly 5 digits.");
        }
    }
}

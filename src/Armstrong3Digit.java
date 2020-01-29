import java.util.Scanner;
public class Armstrong3Digit {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a 3 digit number: ");
        int number = scanner.nextInt();
        int length = String.valueOf(number).length();   // converting number into string to easily calculate the length of the number
        if (length == 3){   // only proceed if the size of the number is 3 as per client requirement
            for (int i=0; i<3; i++){
                char num1 = String.valueOf(number).charAt(i);   // separate every number and cube them
                int cube1 = Integer.parseInt(String.valueOf(num1)) * Integer.parseInt(String.valueOf(num1)) * Integer.parseInt(String.valueOf(num1));
                sum = sum + cube1;  // sum the total of cube
            }
            if (number == sum){     // check if sum of cube is same as original number
                System.out.println(number + " is an amstrong number."); // if yes, amstrong number
            }else {
                System.out.println(number + " is not an amstrong number."); // else not armstrong number
            }
        }else{
            System.out.println("Invalid number of digits. Please try again and enter exactly 3 digits.");
        }
    }
}

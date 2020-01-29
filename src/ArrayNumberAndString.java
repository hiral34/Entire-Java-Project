import java.util.Scanner;
import java.util.Arrays;
public class ArrayNumberAndString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the size of your Numeric array: ");//getting the size of array
        int size = scanner.nextInt();
        int [] int_array = new int[size];
        for(int i=0; i <size; i++){         //storing user values in array
            System.out.print("Enter number " + (i+1) + ": ");
            int_array[i] = scanner.nextInt();
        }
        if(size>0) {
            System.out.println("Ascending order:"); //sorting in ascending order
            Arrays.sort(int_array);
            System.out.println(Arrays.toString(int_array));
            for (int i = (size - 1); i >= 0; i--) {
                if (i == (size - 1)) {
                    System.out.print("Descending order: " + (int_array[i]) + ", "); //descending order
                } else if (i == 0) {
                    System.out.print((int_array[i]));
                } else {
                    System.out.print((int_array[i]) + ", ");
                }
            }
        }
        System.out.print("\nWould you like to sort a String Array(y/n)?: ");        //getting size of string array
        char ans = scanner.next().toLowerCase().charAt(0);
        if (ans=='y') {
            System.out.print("\nPlease enter the size of your String array: ");
            int string_size = scanner.nextInt();
            String[] string_array = new String[string_size];
            for (int i = 0; i < string_size; i++) {     //accepting string value from user to store in array
                System.out.print("Please enter String number " + (i + 1) + ": ");
                string_array[i] = scanner.next().toLowerCase();
            }
            if (string_size > 0) {
                Arrays.sort(string_array);
                System.out.println("Ascending order: " + Arrays.toString(string_array));    //sorting in ascending order
                for (int i = (string_size - 1); i >= 0; i--) {
                    if (i == (string_size - 1)) {
                        System.out.print("Descending order: " + string_array[i] + ", ");    //sorting in descending order
                    } else if (i == 0) {
                        System.out.print(string_array[i]);
                    } else {
                        System.out.print(string_array[i] + ", ");
                    }
                }
            }
        }
    }
}

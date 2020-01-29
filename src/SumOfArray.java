import java.util.Scanner;
public class SumOfArray {
    public static void main(String[] args) {
        int sum=0;      //setting sum = 0 at the beginning of each run
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of rows for your 2D array: ");
        int rows = scanner.nextInt();
        System.out.print("Please enter the number of columns for your 2D array: ");
        int columns = scanner.nextInt();
        int [][] sum_array = new int[rows][columns];
        for (int i=0; i<rows; i++){         //outer loop to run the rows
            for (int j=0; j<columns; j++){      //inner loop to iterate through the columns
                System.out.print("please enter value for " +i+","+j+": ");
                sum_array[i][j] = scanner.nextInt();
                sum = sum + sum_array[i][j];    //totalling while storing the array numbers
            }
        }
        System.out.println("Here's your " + rows + "x" + columns + " array: ");
        for (int i=0; i<rows; i++){         //Loop to display the user defined array
            for (int j=0; j<columns; j++){
                System.out.print(sum_array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.print("The Sum of their total is: " + sum);      //finally display the sum of all the array numbers
    }
}

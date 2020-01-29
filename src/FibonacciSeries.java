import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number upto which you would like to see the Fibonacci series: ");
        int num = scanner.nextInt();
        int i = 0;
        int j = 1;
        int sum = 0;
        while ((i+j) <= num){   // condition to check upto which number the sequence needs to run
            sum = i + j;
            if(i==0){       //Condition to print the first number
                System.out.print(j + ",");
            }
            System.out.print((i + j));  // prints second number of the series which is 0 + first number
            if((sum+j) <= num){         // condition to check if next number is going to be printed then put , or else no ,
                System.out.print(",");
            }
           i = j;       // carry on the adding sequence in series
           j = sum;     // carry on the adding sequence
        }
    }
}

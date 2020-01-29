import java.util.Scanner;
public class DoWhileTimeTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number upto which times table you would like to see: ");
        int num = scanner.nextInt();
        int i = 0;
        do {
            for(int j=1; j<=12; j++){   // Loop to print times tables upto the number user has asked for
                System.out.println(i + " X " + j + " = " + i*j);
            }
            i++;
        }while(i<= num);
    }
}

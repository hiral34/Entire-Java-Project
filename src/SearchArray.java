import java.util.Scanner;
public class SearchArray {
    public static void main(String[] args) {
        boolean match_found=false;
        int rows, columns;
        String str_array_num="";
        Scanner scanner = new Scanner(System.in);
        //Numeric array
        System.out.print("Please enter the rows of your array: ");
        rows = scanner.nextInt();
        System.out.print("Please enter the columns of your array: ");
        columns = scanner.nextInt();
        int [][] int_array = new int [rows][columns];
        for (int i=0; i<rows; i++){     //accept user defined array input
            for(int j=0; j<columns; j++){
                System.out.print("Please enter array number " + i+","+j+": ");
                int_array[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Here's your "+ rows + "x" + columns + " array:\n");
        for (int i=0; i<rows; i++){     //print user's array here
            for(int j=0; j<columns; j++){
                System.out.print(int_array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.print("Please enter a Number you would like to search: ");
        int search_number = scanner.nextInt();
        for (int i=0; i<rows; i++){         // search for match with user entered number
            for (int j=0; j<columns; j++){
                if (int_array[i][j] == search_number){
                    match_found = true;
                    str_array_num = (i+","+j);
                }
            }
        }
        if(match_found){        //display search result
            System.out.println("We found a match to your number in array no.:" + str_array_num);
        }else{
            System.out.println("Sorry no match was found to number: " + search_number);
        }
        System.out.print("Would you like to create and search a String array?: ");
        char ans = scanner.next().toLowerCase().charAt(0);
        if (ans == 'y') {       //String Array
            match_found=false;
            str_array_num = "";
            System.out.print("Please enter the rows of your array: ");
            rows = scanner.nextInt();
            System.out.print("Please enter the columns of your array: ");
            columns = scanner.nextInt();
            String[][] string_array = new String[rows][columns];
            for (int i = 0; i < rows; i++) {            // Accept input for user defined string array
                for (int j = 0; j < columns; j++) {
                    System.out.print("Please enter string " + i + "," + j + ": ");
                    string_array[i][j] = scanner.next().toLowerCase();
                }
            }
            System.out.print("Here's your " + rows + "x" + columns + " String array:\n");
            for (int i = 0; i < rows; i++) {        // Print user defined string array
                for (int j = 0; j < columns; j++) {
                    System.out.print(string_array[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.print("Please enter a String you would like to search: ");
            String search_string = scanner.next().toLowerCase();
            for (int i = 0; i < rows; i++) {            // search for the user entered string for a match
                for (int j = 0; j < columns; j++) {
                    if (string_array[i][j].matches(search_string)) {
                        match_found = true;
                        str_array_num = (i + "," + j);
                    }
                }
            }
            if (match_found == true) {          // Display search result.
                System.out.println("We found a match to your string in array no.:" + str_array_num);
            } else {
                System.out.println("Sorry no match was found to string: " + search_string);
            }
        }
    }
}

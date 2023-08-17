import java.util.Scanner;
public class LargestOfThreeLiveDemo {
    public static void main(String[] args){
        //Create a Variable Declaration Section
        String userName; //string = class || "" = no string zero length string //Edit: Removed "" no initialization?
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int largest = 0;
        int sum = 0;

        System.out.println("\n\nWelcome to my largest of three program\n\n");

        //create a scanner
        Scanner myScanner = new Scanner(System.in);

        //Prompt the user for username
        System.out.println("Please enter your name");
        //store username in the variable
        userName = myScanner.nextLine();

        //Output the userName
        System.out.println("\n\nThe username is: \n\n" + userName);

        //Get three int from user
        // Prompt for first int.
        System.out.println("Enter Number one: ");
        num1 = myScanner.nextInt();
        //Output num1
        System.out.println("You entered: " + num1 + " for the first number");

        // Prompt for second int.
        System.out.println("Enter Number two: ");
        num2 = myScanner.nextInt();
        //Output num2
        System.out.println("You entered: " + num2 + " for the second number");

        // Prompt for third int.
        System.out.println("Enter Number three: ");
        num3 = myScanner.nextInt();
        //Output num3
        System.out.println("You entered: " + num3 + " for the third number");

        //out for all 3 numbers
        System.out.println("\n\nAll the numbers you entered are:\n\n" + num1 + " and " + num2 + " and " + num3);

        //This is a statement to find the largest
        if(num1 > num2 & num1 > num3){
            largest  = num1;
        }
        if(num2 > num1 & num2 > num3){
            largest  = num2;
        }
        if(num3 > num1 & num3 > num1){
            largest  = num3;
        }
        System.out.println("The largest number of: " + num1 + ", " + num2 + ", " + num3 + " is: " + largest);
    }
}

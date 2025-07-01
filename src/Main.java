import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        1 - Write a Java method to find the smallest number among three
        numbers.
        Test Data:
        Input the first number: 25
        Input the Second number: 37
        Input the third number: 29
        Expected Output:
        The smallest value is 25.0
         */
        Scanner input1 = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int num1 = input1.nextInt();
        System.out.println("Input the Second number: ");
        int num2 = input1.nextInt();
        System.out.println("Input the third number: ");
        int num3 = input1.nextInt();
        smallestNumber(num1, num2, num3);

        /*
        2 - Write a Java method that check if the entered number is negative or
        positive or zero.
         */
        Scanner input2 = new Scanner(System.in);
        System.out.println("Input a number: ");
        int checkNum = input2.nextInt();
        String msg = checkValue(checkNum);
        System.out.println(msg);

        /*
        3 - Write a Java method to check whether a string is a valid password.
        Password rules:
        A password must have at least ten characters. A
        password consists of only letters and digits. A
        password must contain at least two digits.
        Expected Output:
        1. A password must have at least eight characters.
        2. A password consists of only letters and digits.
        3. A password must contain at least two digits
        Input a password (You are agreeing to the above Terms and
        Conditions.):
        abcd1234
        Password is valid: abcd1234
         */
        Scanner input3 = new Scanner(System.in);
        System.out.println("1. A password must have at least eight characters.                                          \n" +
                "2. A password consists of only letters and digits.                                          \n" +
                "3. A password must contain at least two digits                                         \n" +
                "Input a password (You are agreeing to the above Terms and \n" +
                "Conditions.):  ");
        String pass = input3.nextLine();
        String passwordMsg = checkPassword(pass);
        System.out.println(passwordMsg);

    }

    public static void smallestNumber(int num1, int num2, int num3) {

        if (num1 < num2 && num1 < num3) {
            System.out.println("The smallest value is: " + num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("The smallest value is: " + num2);
        } else if (num3 < num1 && num3 < num2) {
            System.out.println("The smallest value is: " + num3);
        } else {
            System.out.println("The numbers are equal: " + num1 + ", " + num2 + ", " + num3);
        }
    }

    public static String checkValue(int num) {
        String msg = "";
        if (num > 0) {
            msg = "The value entered is positive";
        } else if (num < 0) {
            msg = "The value entered is negative";
        } else {
            msg = "The value entered is zero";
        }
        return msg;
    }

    public static String checkPassword(String pass) {
        String msg = "";
        String numRegex = ".*[0-9].*[0-9].*";
        String alphaRegex = ".*[a-z].*";
        String alphaRegexCap = ".*[A-Z].*";

        if ((pass.length() >=8) && (pass.matches(numRegex) && (pass.matches(alphaRegex) || pass.matches(alphaRegexCap)))) {
            msg = "Password is Valid " + pass;
        } else {
            msg = "Password is not Valid " + pass;
        }

        return msg;
    }


}
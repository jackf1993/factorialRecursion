/* author: Jack farah
 * description: implementation of a recursive call. Program takes in user input and finds the factorial
 *              of the integer inputted. This program does it in 2 different ways, a regular for loop
 *              and a recursion version.
 */

import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in); //creating scanner object.

    public static void main(String[] args) {

       System.out.println("Enter an integer you would like to Factorial: \r");
       int in = input.nextInt();  // creating an instance of object input (Scanner Class)
        System.out.println(recursive(in)); // calling recursion method
        System.out.println(factorial(in)); // calling for loop method

    }

    public static int recursive(int num){  //recursion method
        if(num == 0){   //break statement for recursion.
            return 1;
        }
        return num * recursive(num -1);  // recursion call with n(n-1) formula for factorial.
    }

    public static int factorial(int num){  //for loop method.
        if(num ==0){
            return 1;
        }

        int factorial = 1;                  // calculates factorial through a for loop
        for(int i = 1; i <=num ; i++){
            factorial *=i;
        }
        return factorial;
    }
}

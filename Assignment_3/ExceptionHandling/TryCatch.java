package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input=0;   // here we have to initialize the input because we cannot directly used inside try block
        try{
        input=scanner.nextInt();   // if any error occurs try block remains un touched so it is mantory to initialize local variable before try block
        }
        catch(InputMismatchException e){
            System.out.println("Type Miss Match");  
        }
        System.out.println("Entered Number is : "+input);   // if error occurs it cannot use uninitialized input variable
    }
}

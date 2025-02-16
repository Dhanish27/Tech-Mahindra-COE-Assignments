package ExceptionHandling;

class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}

public class CheckOddNumber {
    public static void checkNumber(int number) throws OddNumberException{
        if(number%2!=0){
            throw new OddNumberException("Entered Number : "+number+" is odd");
        }
        else{
            System.out.println("Number is even");
        }
    }
    public static void main(String[] args) {
        int num=7;
        try{
        checkNumber(num);
        }
        catch(OddNumberException e){
            System.out.println(e.getMessage());
        }
    }
    
}

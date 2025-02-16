package Task1;

import java.util.Scanner;

public class AlternativeCapitalize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2="";

        for(int i=0;i<str1.length();i++){
            if(i%2==0){
                str2=str2+(""+ str1.charAt(i)).toUpperCase();
            }
            else{
                str2=str2+str1.charAt(i);
            }
        }
        System.out.println(str2);
        
    }
}

package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListReverse {
    public static<t> void reverseList(List<t> list){
        List<t> list1= new ArrayList<t>();
        for(int i=list.size()-1;i>=0;i--){
            list1.add(list.get(i));
        }
        System.out.println(list1);
    }
    public static void main(String[] args) {
        reverseList(Arrays.asList(1,2,3,4,5));
        reverseList(Arrays.asList("Ramesh","Suresh","Ganesh","Kumar"));
    }
}

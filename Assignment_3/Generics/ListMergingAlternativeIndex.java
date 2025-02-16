package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMergingAlternativeIndex {

    public static<t extends Number> void mergeList(List<t> list1,List<t> list2){
        List<t> list3 = new ArrayList<>();
        int maxLength = Math.max(list1.size(),list2.size());
        for(int i=0;i<maxLength;i++){
            if(i<list1.size()){
                list3.add(list1.get(i));
            }
            if(i<list2.size()){
                list3.add(list2.get(i));
            }
        }
        System.out.println(list3);
    }
    public static void main(String[] args) {
        mergeList(Arrays.asList(1,2,3,4,5,10,11,12), Arrays.asList(6,7,8,9));
    }
}

package Task1.StudentsMark;

import java.util.Comparator;

public class StudentsComparator implements Comparator<Students>{

    @Override
    public int compare(Students obj1,Students obj2){
        return Double.compare(obj2.getAvg(), obj1.getAvg());     // descending order logic since it is a rank
    }

}

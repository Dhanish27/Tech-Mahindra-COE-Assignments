package Task1.StudentsMark;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Students> rank = new ArrayList<>();

        Students student1 = new Students("Ramesh", Arrays.asList(90, 80, 70));
        Students student2 = new Students("Suresh", Arrays.asList(90, 85, 75));
        Students student3 = new Students("Jai", Arrays.asList(82, 90, 80));

        rank.add(student1);
        rank.add(student2);
        rank.add(student3);

        Collections.sort(rank, new StudentsComparator());

        for (Students student : rank) {
            System.out.println("Name : " + student.getName() + " Average : " + student.getAvg() + " Total : "
                    + student.getTotalMarks());
        }

    }
}

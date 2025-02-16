package Task1.StudentsMark;

import java.util.List;

public class Students {
    private String name;
    private List<Integer> marks;
    private double totalMarks;
    private double avg;

    Students(String name, List<Integer> marks) {
        this.name = name;
        this.marks = marks;
        computeTotal();
        computeAverage();

    }

    public void computeTotal() {
        for (double mark : marks) {
            totalMarks += mark;
        }
    }

    public void computeAverage() {
        avg = totalMarks / 3;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public double getTotalMarks() {
        return totalMarks;
    }

    public double getAvg() {
        return avg;
    }

}

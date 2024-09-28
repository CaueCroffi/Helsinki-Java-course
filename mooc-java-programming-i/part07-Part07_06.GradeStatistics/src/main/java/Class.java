/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pichau
 */
import java.util.ArrayList;

public class Class {

    private ArrayList<Student> enrolledStudents;

    public Class() {
        enrolledStudents = new ArrayList<>();
    }

    public void add(int grade) {
        if (grade > 0 && grade <= 100) {
            enrolledStudents.add(new Student(grade));
        }
    }

    public double totalAverage() {
        double average = 0;
        for (Student i : enrolledStudents) {
            average += i.getScore();
        }
        return average / enrolledStudents.size();
    }

    public double passingAverage() {
        double average = 0;
        int passingTotal = 0;

        for (Student i : enrolledStudents) {
            if (i.getScore() >= 50) {
                average += i.getScore();
                passingTotal++;
            }
        }
        return average / passingTotal;
    }

    public double passPercentage() {
        int passingTotal = 0;
        for (Student i : enrolledStudents) {
            if (i.getScore() >= 50) {
                passingTotal++;
            }
        }
        return ((double) passingTotal / enrolledStudents.size()) * 100;
    }

    public String toString() {
        String result = "Grade distribution:\n";
        for (int availableGrades = 5; availableGrades >= 0; availableGrades--) {
            result += (availableGrades + ": ");
            for (Student studentGrade : enrolledStudents) {
                if (studentGrade.getGrade() == availableGrades) {
                    result += "*";
                }
            }
            result += availableGrades == 0 ? "" : "\n";
        }
        return result;
    }
}

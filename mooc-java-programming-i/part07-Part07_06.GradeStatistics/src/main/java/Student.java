/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pichau
 */
public class Student {

    private int score;
    private int grade;

    public Student(int score) {
        this.score = score;
        this.grade = grading(this.score);
    }

    public int grading(int score) {
        if (score >= 90) {
            return 5;
        }
        if (score >= 80) {
            return 4;
        }
        if (score >= 70) {
            return 3;
        }
        if (score >= 60) {
            return 2;
        }
        if (score >= 50) {
            return 1;
        }
        return 0;
    }

    public int getGrade() {
        return grade;
    }

    public int getScore() {
        return score;
    }
}


import java.util.ArrayList;

public class ExerciseManagement {

    ArrayList<Exercise> exercises;

    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }

    public ArrayList<String> exerciseList() {
        ArrayList<String> list = new ArrayList<>();
        for (Exercise ex : this.exercises) {
            list.add(ex.getName());
        }
        return list;
    }

    public void add(String exerciseToAdd) {
        this.exercises.add(new Exercise(exerciseToAdd));
    }

    public void markAsCompleted(String completedExercise) {
        for (Exercise ex : this.exercises) {
            if (ex.getName().equals(completedExercise)) {
                ex.setCompleted(true);
            }
        }
    }

    public boolean isCompleted(String exercise) {
        for (Exercise ex : this.exercises) {
            if (ex.getName().equals(exercise)) {
                return ex.isCompleted();
            }
        }
        return false;
    }

    public void remove(String exToRemove) {
        for (int i = 0; i < this.exercises.size(); i++) {
            if (this.exercises.get(i).getName().equals(exToRemove)) {
                this.exercises.remove(i);
            }
        }
    }
}

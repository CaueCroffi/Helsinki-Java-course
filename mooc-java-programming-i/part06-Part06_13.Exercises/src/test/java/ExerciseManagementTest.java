
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class ExerciseManagementTest {

    private ExerciseManagement management;

    @Before
    public void initialize() {
        management = new ExerciseManagement();
    }

    @Test
    public void exerciseListEmptyAtBeginning() {
        assertEquals(0, management.exerciseList().size());
    }

    @Test
    public void addinExerciseGrowsListByOne() {
        management.add("Write a test");
        assertEquals(1, management.exerciseList().size());
    }

    @Test
    public void addedExerciseIsInList() {
        management.add("Write a test");
        assertTrue(management.exerciseList().contains("Write a test"));
    }

    @Test
    public void exercisesCanBeMarkedAsCompleted() {
        management.add("Write a test");
        management.markAsCompleted("Write a test");
        assertTrue(management.isCompleted("Write a test"));
    }

    @Test
    public void ifNotMarkedCompletedIsNotCompleted() {
        management.add("Write a test");
        management.markAsCompleted("Write a test");
        assertFalse(management.isCompleted("false exercise"));
    }

    @Test
    public void removingExerciseDecreaseList() {
        management.add("Exercise 1");
        management.add("Exercise 2");
        management.remove("Exercise 2");
        assertEquals(1, management.exerciseList().size());
    }

    @Test
    public void removeExercise() {
        management.add("Exercise 1");
        management.remove("Exercise 1");
        assertFalse(management.exerciseList().contains("Exercise 1"));
    }
}

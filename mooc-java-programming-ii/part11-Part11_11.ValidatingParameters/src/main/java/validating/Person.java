package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {

        if (name == null || name.isEmpty() || name.length() > 40 || age < 0 || age > 120) {
            throw new IllegalArgumentException();
        }

        try {
            this.name = name;
            this.age = age;
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

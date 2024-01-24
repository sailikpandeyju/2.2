// Design and implement Student class with roll, name and score as attributes.
// It will have methods to set attributes(attribute valyes passed as arguments),
// display the attributes, copy(that copies the content of invoking object to
// another object passed as argument). Verify that methods are working properly

class Student {
    // Private member variables
    private String name;
    private int roll;
    private float score;

    // Default constructor
    Student() {
    }

    // Parameterized constructor
    Student(String name, int roll, float score) {
        this.name = name;
        this.roll = roll;
        this.score = score;
    }

    // Setter methods to set the values of member variables
    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setScore(float score) {
        this.score = score;
    }

    // Getter methods to retrieve the values of member variables
    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public float getScore() {
        return score;
    }

    // Display method to print the details of the student
    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Roll: " + this.roll);
        System.out.println("Score: " + this.score);
    }

    // Copy method to copy the details of another student object
    public void copy(Student s) {
        this.name = s.getName();
        this.roll = s.getRoll();
        this.score = s.getScore();
    }
}

public class seven {
    public static void main(String args[]) {
        // Create a new student object 's1' and initialize it with values
        Student s1 = new Student("Sailik", 5, (float) 45.5);

        // Display the details of 's1' using the display method
        s1.display();

        // Modify the name of 's1' using the setName method
        s1.setName("Rudra");

        // Display the updated details of 's1' using the display method
        s1.display();

        // Modify the roll number of 's1' using the setRoll method
        s1.setRoll(4);

        // Display the updated details of 's1' using the display method
        s1.display();

        // Modify the score of 's1' using the setScore method
        s1.setScore((float) 92.78);

        // Display the updated details of 's1' using the display method
        s1.display();

        // Create a new student object 's2' using the default constructor
        Student s2 = new Student();

        // Print a message indicating that the contents are being copied
        System.out.println("The contents are being copied");

        // Copy the details of 's1' to 's2' using the copy method
        s2.copy(s1);

        // Display the details of 's2' using the display method
        s2.display();
    }
}

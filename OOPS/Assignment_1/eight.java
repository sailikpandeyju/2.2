//Add constructors in the Student class of earlier problem so that objects can be created with
//i)roll only, ii) roll and name only, iii) roll, name and score, iv) no value.
//Also include a copy constructor. Check whether constructors are working or not. 
//Verify copy constructors results into deep copy or not.

class Student {
    // Private member variables
    private int roll;
    private String name;
    private float score;

    // Default constructor
    Student() {
    }

    // Constructor with roll parameter
    Student(int roll) {
        this.roll = roll;
    }

    // Constructor with roll and name parameters
    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    // Constructor with roll, name, and score parameters
    Student(int roll, String name, float score) {
        this.roll = roll;
        this.name = name;
        this.score = score;
    }

    // Copy constructor
    Student(Student s) {
        this.roll = s.roll;
        this.name = s.name;
        this.score = s.score;
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
}

public class eight {
    public static void main(String args[]) {
        // Create a student object using the default constructor
        Student s1 = new Student();
        s1.display(); // Output: Name: null, Roll: 0, Score: 0.0

        // Create a student object using the constructor with roll parameter
        Student s2 = new Student(10);
        s2.display(); // Output: Name: null, Roll: 10, Score: 0.0

        // Create a student object using the constructor with roll and name parameters
        Student s3 = new Student(20, "Sailik");
        s3.display(); // Output: Name: John, Roll: 20, Score: 0.0

        // Create a student object using the constructor with roll, name, and score
        // parameters
        Student s4 = new Student(30, "Sailik", 85.5f);
        s4.display(); // Output: Name: Jane, Roll: 30, Score: 85.5

        // Create a student object using the copy constructor
        Student s5 = new Student(s4);
        s5.display(); // Output: Name: Jane, Roll: 30, Score: 85.5

        // Modify the values of s4
        s4.setName("Tanmoy");
        s4.setRoll(40);
        s4.setScore(92.3f);

        // Display the details of s4 and s5
        s4.display(); // Output: Name: Alice, Roll: 40, Score: 92.3
        s5.display(); // Output: Name: Jane, Roll: 30, Score: 85.5
    }
}

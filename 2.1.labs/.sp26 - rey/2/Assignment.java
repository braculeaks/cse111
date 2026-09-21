public class Assignment {               /* a2q2 */
    public int tasks = 0;
    public String difficulty = null;
    public boolean submission = false;

    public void printDetails() {
        System.out.println("Number of tasks: " + tasks);
        System.out.println("Difficulty level: " + difficulty);
        System.out.println("Submission required: " + submission);
    }

    public String makeOptional() {
        if (submission == false) {
            return "Submission is already not required";
        }
        else {
            submission = false;
            return "Assignment will not require submission";
        }
    }
}

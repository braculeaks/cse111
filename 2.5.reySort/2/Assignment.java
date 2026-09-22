public class Assignment {       // q23
    int tasks = 0;
    String difficulty = null;
    boolean submission = false;

    public void printDetails()
    {
        System.out.println("Number of tasks: " + tasks);
        System.out.println("Difficulty level: " + difficulty);
        System.out.println("Submission required: " + submission);
    }

    public String makeOptional() {
        if (submission == true) {
            submission = false;
            return "Assignment will not require submission";
        }
        else {
            return "Submission is already not required";
        }
    }
}
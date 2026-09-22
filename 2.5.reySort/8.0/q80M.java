// Blueprint of a BluePrint
// You can make other blueprints from this one
abstract class Task {
    public String title;            // instance variable

    public Task(String title) {     // ABSTRACT can have Constructor
        this.title = title;
    }

    public abstract int priority();

    public void show() {
        System.out.println(title + ": " + priority());
    }
}


// Blueprint
// you can make objects from this blueprint
class QuizTask extends Task {
    public int questions;

    public QuizTask(String title, int questions) {
        super(title);
        this.questions = questions;
    }

    public int priority() {
        return questions * 2;
    }
}



public class q80M {
    public static void main(String[] args) 
    {
        Task obj = new Task("Something");                   // won't work
        QuizTask obj2 = new QuizTask("Quiz 1 Task 1", 3);   // will work
        QuizTask obj3 = new QuizTask("Quiz 1 Task 2", 1);   // will work

        System.out.println(obj2.title);     // Quiz 1 Task 1
        System.out.println(obj3.title);     // Quiz 1 Task 2
    }
}


/*

Introducing: Abstract

*/

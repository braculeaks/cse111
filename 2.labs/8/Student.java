public class Student {                  /* a8h1 */
    public String msg = "I love BU";
    public String shout() {
        return msg;
    }
}

class CSEStudent extends Student {
    public String msg;

    CSEStudent() {
        super();
        msg = "I want to transfer to CSE";
    }

    @Override
    public String shout() {
        return msg;
    }
}

class CSE111Student extends Student {
    public String msg;

    CSE111Student() {
        super();
        msg = "I love Java Programming";
    }

    @Override
    public String shout() {
        return msg;
    }
}

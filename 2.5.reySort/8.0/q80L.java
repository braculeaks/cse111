class Notice {
    public String title;
    public Notice(String title) {
        this.title = title;
    }
    public int priority() {
        return 1;
    }
    public void show() {
        System.out.println("Notice: " + title);
    }
}

class EmailNotice extends Notice {
    public int attachments;
    public EmailNotice(String title, int attachments) {
        super(title);
        this.attachments = attachments;
    }

    @Override
    public int priority() {
        return 1+attachments;
    }

    @Override
    public void show() {
        System.out.println("Email: " + super.title);
    }
}

class AlertNotice extends Notice {
    public int level;
    public AlertNotice(String title, int level) {
        super(title);
        this.level = level;
    }

    @Override
    public int priority() {
        return level*10;
    }

    @Override
    public void show() {
        System.out.println("Alert: " + super.title);
    }
}


public class q80L {
    public static void main(String[] args) {
        Notice[] board = new Notice[3];
        board[0] = new Notice("Club meeting");
        board[1] = new EmailNotice("Assignment Update", 2);
        board[2] = new AlertNotice("Server down", 3);

        for (int i = 0; i < 3; i++) {
            board[i].show();
            System.out.println(board[i].priority());
        }
    }
}



/*

Introducing: 

*/

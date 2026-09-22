// Message 
//     <-- Email Message 
//            <-- UrgentEmailMessage

class Message {
    public String label = "Message";
    public void show() {
        System.out.println("General message");
    }
}

class EmailMessage extends Message {
    public String label = "Email";
    public void send() {
        System.out.println("Sending email");
    }
}

class UrgentEmailMessage extends EmailMessage {
    public String label = "Urgent";
    public void escalate() {
        System.out.println("Escalating");
    }
}

public class q80Q {
    public static void main(String[] args) {
        EmailMessage e = new UrgentEmailMessage();   // UpCasting


            // e.escalate();       // does not work, why?


        ((UrgentEmailMessage)e).escalate();     // Works: ThikThak DownCasting 
            // BCZ: an UrgentEmailMessage "is-a" EmailMessage 



        Message msg = new UrgentEmailMessage();   // UpCasting
        ((UrgentEmailMessage)e).escalate();       // Also Works: ThikThak DownCasting 




        Message m = new UrgentEmailMessage();           // UpCasting
        System.out.println(((EmailMessage)m).label);    // DownCasting: Prints "Email"
    }
}



/*

Introducing: "is-a" relationship. 
    Jekono Inheritance re "is-a" relation bola jay

Introducing: Infamous Polymorphism Tracing of BRACU CSE111

*/
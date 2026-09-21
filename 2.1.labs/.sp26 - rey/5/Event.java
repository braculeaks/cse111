public class Event {                    /* a5q5 */
    static int c = 0;
    static Event ins[] = new Event[5];

    static void REY_addEvent(Event ev) {
        ins[c++] = ev;
    }

    private String name;
    public  String date;
    public  String getName() {return name;}

    static void allEventInfo() {
        System.out.println("Total Events: " + c);
        System.out.println("Event Details: ");
        for (int i = 0; i < c; i++) {
            System.out.println("Event " + (i+1) + ": ");
            System.out.println(ins[i].details());
        }
    }

    Event(String n, String d) {
        name = n;
        date = d;
        REY_addEvent(this);
    }

    String details() {
        String out = "";
        out += "Name: " + name + "\n";
        out += "Date: " + date;
        return out;
    }
}



class Organizer {
    String name;
    Event events[] = new Event[4];
    int c = 0;

    Organizer() {
        System.out.println("Please provide the organizer's name");
    }
    Organizer(String n) {
        name = n;
    }

    void organizeEvent(Event ev) {
        if (c < 4) {
            System.out.println(name + " successfully organized " + ev.getName());
            events[c++] = ev;
        }
    }

    void searchEventByDate(String d) {
        boolean found = false;
        
        for (int i = 0; i < c; i++) {
            if (d.equals(events[i].date)) {
                System.out.println(events[i].getName());
                found = true;
            }
        }

        if (found == false) {
            System.out.println("No event is scheduled for " + d);
        }
    }
}
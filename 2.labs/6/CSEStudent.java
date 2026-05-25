public class CSEStudent extends Student         /* a6q5 */
{
    static int total = 0;
    static String list[] = {"CSE110", "CSE111", "CSE220", "CSE221"};

    static void details() {
        System.out.println("Total CSE Students: " + total);
        System.out.println("Available Lab Based Courses: ");
        System.out.println("CSE110 CSE111 CSE220 CSE221");
    }

    int find(String c) {
        for (int i = 0; i < list.length; i++) {
            if (c.equals(list[i])) {
                return i;
            }
        }
        return -1;
    }
    
    void addLabBasedCourse(String c) {
        int k = find(c);
        if (k == -1) {
            System.out.println("It is not a lab based course!");
        }
        else {
            super.courses += c + " ";
        }
    }

    CSEStudent(String n, int ag) {
        super(n, ag);
    }
}

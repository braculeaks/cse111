public class Animalkeepers {                        /* a5q4 */
    static String Animals[] = {"Lion", "Tiger", "Seal", "Gorilla", "Deer"};
    static String tasks[] = new String[5];          // 1 task per animal
    static String keepers[] = new String[5];        // task keeper name, as per animal

    static int kN = 0;      // keepersCount
    static int tN = 0;      // tasksCount

    static void details() {
        if (kN < 1) {
            System.out.println("No Animal Keepers working yet.");
        }
        else {
            System.out.println("Total Animal Keeper: " + kN);
            System.out.println("Total Task assigned: " + tN);
            printTasks();
        }
    }

    static void printTasks() {
        if (tN < 1) {
            System.out.println("No tasks assigned.");
        }
        else {
            for (int i = 0; i < 5; i++) {
                if (tasks[i] != null) {
                    System.out.println(tasks[i] + " (Keeper - " + keepers[i] + ") === " + Animals[i]);
                }
            }
        }
    }

    static int REY_findAnimal(String a) {
        for (int i = 0; i < 5; i++) {
            if (Animals[i].equals(a)) {
                return i;
            }
        }
        return -1;
    }




    String keeper;
    private int ID;
    
    Animalkeepers(String n) {
        keeper = n;
        ID = 100 + kN + 1;
        kN++;

        System.out.println(n + " with ID " + ID + " got the job!");
    }

    void doTask(String a, String t) {
        int k = REY_findAnimal(a);
        if (k == -1) {
            System.out.println("Animal not in the Safari.");
        }
        else {
            if (tasks[k] == null) {tN++;}
            
            System.out.println("Task assigned to " + keeper);
            tasks[k] = t;
            keepers[k] = this.keeper;
        }
    }
}

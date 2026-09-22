public class Movie {        // q47B
    String name;
    String genre;
    String dur = "Unknown";

    Movie(String n , String g, String d){
        this(n , g);
        dur = d;
    }
    Movie(String n , String g){
        name = n;
        genre = g;
    }
}

class NetflixUser {
    String name;
    String plan = "Free";
    Movie[] movie  = new Movie[3];
    int count = 0;
    

    NetflixUser(String n){
        name = n;
        System.out.println("New user account created!");
    }
    NetflixUser(String n, String p){
        this(n);
        plan = p;
    }
    public void addToFavourites(Movie m)
    {
        if (plan.equals("Free")) {
            System.out.println(
                "Cannot add movies to favourites. Please upgrade to Netflix Premium."
            );
        }
        else if (plan.equals("Premium")) {
            if(count < 3) {
                System.out.println("Movie added to favourites.");
                movie[count] = m;
                count++;
            }
            else {
                System.out.println("Cannot add new movies. Favourites list is full.");
            }
        }
    }
            
    public void showFavourites()
    {
        if (plan.equals("Free"))
            System.out.println("No available favourites. Please upgrade to Netflix Premium.");
        else 
        {
            System.out.println("Showing "+name+"'s Favourites:");
            for(int i = 0; i < count; i++) {
                System.out.println(movie[i].name+", "+movie[i].genre+", Duration: "+movie[i].dur);
            }
        }
    }
    public void upgradePlan()
    {
        if (plan.equals("Free")) {
            System.out.println("Welcome to Netflix Premium!");
            plan ="Premium";
        }
        else if (plan.equals("Premium")) {
            System.out.println("You already have Netflix Premium!");

        }
    }
}
public class q36D_q3u4 {
    public static void main(String[] args) {
        Movie inception = new Movie();
        inception.setMovieDetails("Inception", "Christopher Nolan", 8.8);
        System.out.println("1====================");
        inception.addActors("Leonardo DiCaprio", "Joseph Gordon-Levitt");
        inception.addActors("Ellen Page");
        inception.showInfo();
        System.out.println("2====================");
        Movie avengers = new Movie();
        avengers.setMovieDetails("Avengers: Endgame", "Anthony Russo", 8.4);
        avengers.addActors("Robert Downey Jr.", "Chris Evans", "Scarlett Johansson");
        avengers.showInfo();
        System.out.println("3====================");
        Movie parasite = new Movie();
        parasite.setMovieDetails("Parasite", "Bong Joon-ho");
        parasite.addActors("Song Kang-ho", "Choi Woo-shik");
        parasite.updateRating(8.6);
        parasite.showInfo();
        System.out.println("4====================");
        parasite.updateRating(8.9);
        parasite.showInfo();
    }
}


/*

1====================
Added actor "Leonardo DiCaprio" to
"Inception".
Added actor "Joseph Gordon-Levitt" to
"Inception".
Added actor "Ellen Page" to
"Inception".
Title: Inception
Director: Christopher Nolan
Rating: 8.8
Actors: Leonardo DiCaprio, Joseph
Gordon-Levitt, Ellen Page
2====================
Added actor "Robert Downey Jr." to
"Avengers: Endgame".
Added actor "Chris Evans" to
"Avengers: Endgame".
Added actor "Scarlett Johansson" to
"Avengers: Endgame".
Title: Avengers: Endgame
Director: Anthony Russo
Rating: 8.4
Actors: Robert Downey Jr., Chris
Evans, Scarlett Johansson
3====================
Added actor "Song Kang-ho" to
"Parasite".
Added actor "Choi Woo-shik" to
"Parasite".
Updated rating of "Parasite" to 8.6
Title: Parasite
Director: Bong Joon-ho
Rating: 8.6
Actors: Song Kang-ho, Choi Woo-shik
4====================
Updated rating of "Parasite" to 8.9
Title: Parasite
Director: Bong Joon-ho
Rating: 8.9
Actors: Song Kang-ho, Choi Woo-shik

 */
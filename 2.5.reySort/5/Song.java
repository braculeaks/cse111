public class Song {
    String title;
    String artist;
    int length;

    Song(String t, String a, int l){
        title = t;
        artist = a;
        length = l;
    }
    public void songInfo(){
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Length: " + length + " minutes");
    }  
}

public class Playlist {
    String name;
    Song [] songs = new  Song [10];
    int index = 0;

    Playlist(String n){
        name = n;
        System.out.println(name + " created.");
    }

    // TASK 3 & 4:

    public void addSong(Song s1){
        songs[index] = s1;
        System.out.println(s1.title + " added to " + name + ".");
        index++;
    }

    public void info(){
        System.out.println("First Playlist has the following songs:");

        if(index == 0){
            System.out.println("No songs in " + name + ".");
        }
        else {
            for(int i = 0; i < index; i++){
                System.out.println("Song-"+(i+1));
                songs[i].songInfo();
            }
        }
    }


    // TASK 5

    private void shiftRight(Song s, int inx){

        if(index < 9){
            Song temp = songs[9];
            for(int i = 9; i > inx; i--){
                songs[i] = songs[i-1];
            }
            songs[inx] = s;

            for(int i = 0; i < 10; i++){
                if(songs[i] == null){
                    songs[i] = temp; 
                    break;         
                }
            }
        }
    }

    public void addSong(Song s, int inx){

        if(inx >= 10)
            System.out.println("Cannot add song to Index "+inx+".");
        else {
            shiftRight(s, inx);
            System.out.println(s.title + "added to " + name + ".");
            index++;
            }
    }
    

    // TASK 6

    private int findSongIndex(String title){
        int k = -1;
        for(int i = 0; i < index; i++){
            if (title.equals(songs[i].title)){
                return i;
            }                
        }
        return k;
    }

    public void playSong(String title){
        int inx = findSongIndex(title);
            if(inx == -1)
                System.out.println(title + " not found in playlist " + name +".");
            else
                System.out.println("Playing " + title + " by " + songs[inx].artist +"."); 
    }

    // TASK 7

    public void playSong(int inx){

            if (songs[inx] == null)
                System.out.println("Song at Index "+ inx + " not found in playlist " + name +".");

            else
                System.out.println("Playing " + songs[inx].title + " by " + songs[inx].artist +".");   
    }

    // TASK 8

    private void shiftLeft(int inx){

        for(int i = inx; i < 9; i++){
            songs[i] = songs[i+1];
        }
        songs[9] = null;
    }

    public void deleteSong(String title){
        int inx = findSongIndex(title);
            if(inx == -1)
                System.out.println(title + " not found in playlist " + name +".");
            else {
                shiftLeft(inx);
                System.out.println(title + " deleted from playlist " + name +".");
                index--;
            }
    }

    // TASK 9

    public int totalSong(){
        return index+1;
    }

    // TASK 10

    public void merge (Playlist p2){
        newSize = this.size + p2.size;      // const 
        Song[] newArr = new Song[newSize];
        // copy
        this.songs = newArr;
        for (int i = index; i < 10; i++){
            this.songs[i] = p2.songs[i - index]
        }
    }
}


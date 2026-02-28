package umg.edu.gt.handler;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        PlaylistManager manager = new PlaylistManager();

        manager.addSong(new Song("Believer", "Imagine Dragons", 8, 1));
        manager.addSong(new Song("Blinding Lights", "The Weeknd", 12, 2));
        manager.addSong(new Song("Numb", "Linkin Park", 7, 1));
        manager.addSong(new Song("Levitating", "Dua Lipa", 10, 2));

        manager.playAll();
    }
}
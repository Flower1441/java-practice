import java.util.ArrayList;

public class PlaylistManager {
    private ArrayList<Song> songs = new ArrayList<>();

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Song song) {
        songs.remove(song);
    }

    public Song searchByTitle(String title) {
        for (Song s : songs) {
            if (s.getTitle().equals(title)) {
                return s;
            }
        }
        return null;
    }

    public void listAll() {
        for (Song s : songs) {
            System.out.println(s.getTitle() + "|" + s.getArtist() + "|" + s.getDuration());
        }
    }
}

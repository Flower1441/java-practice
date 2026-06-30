public class PlaylistManagerTest {
    public static void main(String[] args) {
        PlaylistManager playlistManager = new PlaylistManager();
        Song song1 = new Song("Love Story", "Taylor Swift", 236);
        playlistManager.addSong(song1);
        Song song2 = new Song("Young And Beautiful", "Lana Del Rey", 236);
        playlistManager.addSong(song2);
        Song song3 = new Song("You Belong With Me", "Taylor Swift", 231);
        playlistManager.addSong(song3);
        playlistManager.listAll();
        Song found = playlistManager.searchByTitle("Love Story");
        System.out.println(found.getTitle());
        playlistManager.removeSong(song3);
        playlistManager.listAll();
    }
}

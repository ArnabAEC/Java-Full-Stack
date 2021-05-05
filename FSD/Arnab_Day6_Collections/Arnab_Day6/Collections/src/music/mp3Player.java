package music;

import java.util.HashSet;

public class mp3Player {
	public static void main(String[] args) {
		
		songList songList = new songList(new HashSet<mp3>());
		
		songList.insert("Ummidein", "Naalayak", "Main Ka Bukhar", 2);
		songList.insert("Mishri", "Anuv Jain", "Single", 7);
		songList.insert("Bawra", "Naalayak", "NaalayakEP", 2);
		songList.insert("Aaftaab", "The Local Train", "Single", 1);
		
		songList.showSongs();
		
		System.out.println(
				(songList.search(new mp3("Ummidein", "Naalayak", "Main Ka Bukhar", 2)))?"Song Exists.": "Song does not exists.");
		
		System.out.println(songList.play(new mp3("Ummidein", "Naalayak", "Main Ka Bukhar", 2)));
	}
}

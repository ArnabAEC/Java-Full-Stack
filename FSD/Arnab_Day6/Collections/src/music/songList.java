package music;

import java.util.HashSet;

public class songList {
	
	HashSet<mp3> songList;
	
	HashSet<mp3> getSongList() {
		return songList;
	}

	void setSongList(HashSet<mp3> songList) {
		this.songList = songList;
	}

	public songList(HashSet<mp3> songList) {
		super();
		this.songList = songList;
	}

	void insert(String name, String artist, String album, int trackNo) {
		mp3 MP3 = new mp3(name,artist,album,trackNo);
		songList.add(MP3);
	}
	
	void showSongs() {
		for( mp3 song: songList) {
			System.out.println("Song: "+song.toString());
		}
		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((songList == null) ? 0 : songList.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		songList other = (songList) obj;
		if (songList == null) {
			if (other.songList != null)
				return false;
		} else if (!songList.equals(other.songList))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "songList [songList=" + songList + "]";
	}
	String play(mp3 song) {
		if(this.search(song))
		
			return "Playing song: "+song.getName()+" By : "+song.getArtist();
		
		else 
			return "Cannot find song. ";
		
	}
	boolean search(mp3 MP3) {
		if(songList.contains(MP3))
			return true;
		else
			return false;
	}
	

}

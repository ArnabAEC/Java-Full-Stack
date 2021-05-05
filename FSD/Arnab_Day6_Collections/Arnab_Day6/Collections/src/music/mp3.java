package music;

public class mp3 {
	String name;
	String artist;
	String album;
	int trackNo;
	

	public boolean equals(mp3 song) {
		// TODO Auto-generated method stub
		if(song.name.equalsIgnoreCase(this.name)&&
			song.artist.equalsIgnoreCase(this.artist)&&
			song.album.equals(this.album)&&
			song.trackNo==this.trackNo
		)
			return true;
		else
			return false;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getArtist() {
		return artist;
	}
	void setArtist(String artist) {
		this.artist = artist;
	}
	String getAlbum() {
		return album;
	}
	void setAlbum(String album) {
		this.album = album;
	}
	int getTrackNo() {
		return trackNo;
	}
	void setTrackNo(int trackNo) {
		this.trackNo = trackNo;
	}
	@Override
	public String toString() {
		return "name=" + name + ", artist=" + artist + ", album=" + album + ", trackNo=" + trackNo ;
	}
	public mp3(String name, String artist, String album, int trackNo) {
		super();
		this.name = name;
		this.artist = artist;
		this.album = album;
		this.trackNo = trackNo;
	}
	
	

}

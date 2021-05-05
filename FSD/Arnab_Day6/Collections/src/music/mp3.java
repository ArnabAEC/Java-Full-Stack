package music;

public class mp3 {
	String name;
	String artist;
	String album;
	int trackNo;
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((album == null) ? 0 : album.hashCode());
		result = prime * result + ((artist == null) ? 0 : artist.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + trackNo;
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
		mp3 other = (mp3) obj;
		if (album == null) {
			if (other.album != null)
				return false;
		} else if (!album.equals(other.album))
			return false;
		if (artist == null) {
			if (other.artist != null)
				return false;
		} else if (!artist.equals(other.artist))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (trackNo != other.trackNo)
			return false;
		return true;
	}
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

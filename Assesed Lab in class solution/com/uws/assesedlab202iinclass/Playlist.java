package com.uws.assesedlab202iinclass;

public class Playlist {
	private Song[] songs;//Declaration of my Song array
	int index;
	
	
	public Playlist(int sizeOfSongList) {
		this.songs = new Song[sizeOfSongList];//instantiation
		this.index = 0;
	}
	
	//cRud
	public Song[] getSongs() {
		return this.songs;
	}
	
	//crUd
	public void addSong(Song s) throws SongTitleNotUniqueException {
		if (index > this.songs.length) {
			throw new IndexOutOfBoundsException("Attempt  to overflow");
		}
		else if(isSongTitleUnique(s)) {
			throw new SongTitleNotUniqueException();
		}
		else {
			this.songs[this.index] = s;
			this.index++;
		}
	}
	
	private boolean isSongTitleUnique(Song s) {
		// TODO Auto-generated method stub
		return false;
	}

	//cruD
	public void removeSong(Song s) {
		
	}
	//cRud
	public Song getSong(Song s) {
		return null;
	}

	public void sort() {
		InsertionSort.sort(this.songs);
		
	}
}
